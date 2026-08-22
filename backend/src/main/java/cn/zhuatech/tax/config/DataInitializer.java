/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.config;

import cn.zhuatech.tax.model.*;
import cn.zhuatech.tax.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner seed(TaxEntityRepository taxEntitys, TaxFilingRepository orders,
                           TaxRuleRepository taxRules, TaxRiskRepository taxRisks,
                           UserRepository users, PasswordEncoder encoder) {
        return args -> {
            if (taxEntitys.count() > 0) return;
            TaxEntity chemistry = taxEntitys.save(new TaxEntity("TAX-CHEM", "上海运营主体", "税务中心", 180));
            TaxEntity micro = taxEntitys.save(new TaxEntity("TAX-MICRO", "华东销售主体", "研发中心", 120));
            TaxEntity material = taxEntitys.save(new TaxEntity("TAX-MAT", "研发中心主体", "工程中心", 96));

            TaxFiling t1 = orders.save(new TaxFiling("FILING-260801-018", "GB-T-228", "增值税月度申报", material, 24, 16, 1, LocalDate.now().plusDays(1), TaxFiling.Status.RUNNING, "2026-07"));
            TaxFiling t2 = orders.save(new TaxFiling("FILING-260801-021", "CIT-Q3-26", "企业所得税季度预缴", chemistry, 18, 8, 0, LocalDate.now().plusDays(1), TaxFiling.Status.RUNNING, "2026-Q3"));
            TaxFiling t3 = orders.save(new TaxFiling("FILING-260802-006", "ISO-4833", "研发费用加计扣除", micro, 12, 0, 0, LocalDate.now().plusDays(3), TaxFiling.Status.RELEASED, "2026-H1"));
            TaxFiling t4 = orders.save(new TaxFiling("FILING-260711-015", "STAMP-0726", "印花税申报", chemistry, 20, 20, 1, LocalDate.now(), TaxFiling.Status.COMPLETED, "2026-07"));

            taxRules.saveAll(List.of(
                new TaxRule("RULE-HPLC-03", "销项进项匹配规则", chemistry, TaxRule.Status.RUNNING, 88),
                new TaxRule("RULE-ICP-02", "企业所得税调整规则", chemistry, TaxRule.Status.IDLE, 76),
                new TaxRule("RULE-UTM-05", "关联交易校验规则", material, TaxRule.Status.RUNNING, 91),
                new TaxRule("RULE-INC-08", "研发费用归集规则", micro, TaxRule.Status.ALARM, 62)
            ));
            taxRisks.saveAll(List.of(
                new TaxRisk("TAXR-260801-032", t1, "留样复核", 6, 0, TaxRisk.Result.PASSED, "周妍"),
                new TaxRisk("TAXR-260801-011", t2, "前处理复核", 3, 0, TaxRisk.Result.PASSED, "陆承"),
                new TaxRisk("TAXR-260801-018", t4, "申报复核", 5, 1, TaxRisk.Result.FAILED, "周妍"),
                new TaxRisk("TAXR-260802-003", t3, "申报登记确认", 4, 0, TaxRisk.Result.PENDING, "陆承")
            ));
            String demo = encoder.encode("Demo@2026");
            users.saveAll(List.of(
                new UserAccount("operator", demo, "陆承", UserAccount.Role.TAX_ACCOUNTANT, "TAX-CHEM"),
                new UserAccount("planner", demo, "周妍", UserAccount.Role.TAX_MANAGER, null),
                new UserAccount("quality", demo, "顾清", UserAccount.Role.QUALITY, null),
                new UserAccount("admin", encoder.encode("ZhuaTech@2026"), "系统管理员", UserAccount.Role.ADMIN, null)
            ));
        };
    }
}
