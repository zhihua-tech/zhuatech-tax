/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.tax.repository; import cn.zhuatech.tax.model.TaxRule; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface TaxRuleRepository extends JpaRepository<TaxRule,Long>{List<TaxRule> findAllByOrderByCodeAsc();long countByStatus(TaxRule.Status status);}
