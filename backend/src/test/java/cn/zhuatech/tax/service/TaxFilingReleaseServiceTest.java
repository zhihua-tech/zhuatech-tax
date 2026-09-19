/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class TaxFilingReleaseServiceTest {
    private final TaxFilingReleaseService service = new TaxFilingReleaseService();
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void filesControlledReturn() {
        var result = service.assess(new TaxFilingReleaseService.Request("F1", true, true, true, true,
                true, true, true, false, false));
        assertThat(result.decision()).isEqualTo(TaxFilingReleaseService.Decision.FILE);
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void reviewsOperationalReadiness() {
        var result = service.assess(new TaxFilingReleaseService.Request("F2", true, true, true, true,
                true, false, false, false, false));
        assertThat(result.actions()).hasSize(2);
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void blocksControlFailuresAndLateReturn() {
        var result = service.assess(new TaxFilingReleaseService.Request("F3", false, false, false, false,
                false, true, true, true, false));
        assertThat(result.blockers()).hasSize(6);
    }
}
