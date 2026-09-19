/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Entity @Table(name="tax_risk") public class TaxRisk extends BaseEntity {
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String taxRiskNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private TaxFiling taxFiling;
    @Column(nullable=false,length=30) private String taxRiskType; @Column(nullable=false) private int taxRiskQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    protected TaxRisk(){} /**
                           * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                           */
public TaxRisk(String taxRiskNo,TaxFiling taxFiling,String taxRiskType,int taxRiskQty,int defectQty,Result result,String inspector){this.taxRiskNo=taxRiskNo;this.taxFiling=taxFiling;this.taxRiskType=taxRiskType;this.taxRiskQty=taxRiskQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getTaxRiskNo(){return taxRiskNo;} /**
                                                     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                     */
public TaxFiling getTaxFiling(){return taxFiling;} /**
                                                                                                        * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                        */
public String getTaxRiskType(){return taxRiskType;} /**
                                                                                                                                                            * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                            */
public int getTaxRiskQty(){return taxRiskQty;} /**
                                                                                                                                                                                                           * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                           */
public int getDefectQty(){return defectQty;} /**
                                                                                                                                                                                                                                                        * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                        */
public Result getResult(){return result;} /**
                                                                                                                                                                                                                                                                                                  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                  */
public String getInspector(){return inspector;}
}
