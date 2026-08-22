/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="tax_rule") public class TaxRule extends BaseEntity {
    public enum Status { RUNNING, IDLE, MAINTENANCE, ALARM }
    @Column(nullable=false,unique=true,length=32) private String code; @Column(nullable=false,length=80) private String name; @ManyToOne(optional=false,fetch=FetchType.LAZY) private TaxEntity taxEntity;
    @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Status status; @Column(nullable=false) private int oee; @Column(nullable=false) private LocalDateTime lastHeartbeat;
    protected TaxRule(){} public TaxRule(String code,String name,TaxEntity taxEntity,Status status,int oee){this.code=code;this.name=name;this.taxEntity=taxEntity;this.status=status;this.oee=oee;this.lastHeartbeat=LocalDateTime.now();}
    public String getCode(){return code;} public String getName(){return name;} public TaxEntity getTaxEntity(){return taxEntity;} public Status getStatus(){return status;} public int getOee(){return oee;} public LocalDateTime getLastHeartbeat(){return lastHeartbeat;}
}
