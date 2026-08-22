/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.repository; import cn.zhuatech.tax.model.TaxRisk; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface TaxRiskRepository extends JpaRepository<TaxRisk,Long>{List<TaxRisk> findTop10ByOrderByIdDesc();long countByResult(TaxRisk.Result result);}
