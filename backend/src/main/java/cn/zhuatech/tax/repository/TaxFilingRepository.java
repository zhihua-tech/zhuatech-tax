/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.tax.repository; import cn.zhuatech.tax.model.TaxFiling; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface TaxFilingRepository extends JpaRepository<TaxFiling,Long>{List<TaxFiling> findAllByOrderByDueDateAsc();List<TaxFiling> findByTaxEntityCodeOrderByDueDateAsc(String code);long countByStatus(TaxFiling.Status status);}
