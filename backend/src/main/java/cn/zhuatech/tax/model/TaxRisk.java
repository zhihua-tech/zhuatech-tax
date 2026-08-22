/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="tax_risk") public class TaxRisk extends BaseEntity {
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String taxRiskNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private TaxFiling taxFiling;
    @Column(nullable=false,length=30) private String taxRiskType; @Column(nullable=false) private int taxRiskQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    protected TaxRisk(){} public TaxRisk(String taxRiskNo,TaxFiling taxFiling,String taxRiskType,int taxRiskQty,int defectQty,Result result,String inspector){this.taxRiskNo=taxRiskNo;this.taxFiling=taxFiling;this.taxRiskType=taxRiskType;this.taxRiskQty=taxRiskQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    public String getTaxRiskNo(){return taxRiskNo;} public TaxFiling getTaxFiling(){return taxFiling;} public String getTaxRiskType(){return taxRiskType;} public int getTaxRiskQty(){return taxRiskQty;} public int getDefectQty(){return defectQty;} public Result getResult(){return result;} public String getInspector(){return inspector;}
}
