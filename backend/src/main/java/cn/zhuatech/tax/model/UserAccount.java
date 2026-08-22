/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.tax.model;
import jakarta.persistence.*;
@Entity @Table(name="tax_user")
public class UserAccount extends BaseEntity {
    public enum Role { ADMIN, TAX_MANAGER, TAX_ACCOUNTANT, QUALITY }
    @Column(nullable=false,unique=true,length=32) private String username; @Column(nullable=false) private String password;
    @Column(nullable=false,length=50) private String fullName; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Role role;
    @Column(name="tax_entity_code",length=32) private String taxEntityCode; @Column(nullable=false) private boolean enabled=true;
    protected UserAccount(){}
    public UserAccount(String username,String password,String fullName,Role role,String taxEntityCode){this.username=username;this.password=password;this.fullName=fullName;this.role=role;this.taxEntityCode=taxEntityCode;}
    public String getUsername(){return username;} public String getPassword(){return password;} public String getFullName(){return fullName;} public Role getRole(){return role;} public String getTaxEntityCode(){return taxEntityCode;} public boolean isEnabled(){return enabled;}
}
