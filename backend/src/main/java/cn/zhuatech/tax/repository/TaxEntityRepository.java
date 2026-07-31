/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.tax.repository; import cn.zhuatech.tax.model.TaxEntity; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface TaxEntityRepository extends JpaRepository<TaxEntity,Long>{Optional<TaxEntity> findByCode(String code);}
