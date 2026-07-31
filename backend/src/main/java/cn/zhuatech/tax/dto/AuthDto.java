/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.tax.dto;
import cn.zhuatech.tax.model.UserAccount; import jakarta.validation.constraints.NotBlank;
public final class AuthDto {
    private AuthDto(){}
    public record LoginRequest(@NotBlank(message="请输入用户名") String username,@NotBlank(message="请输入密码") String password){}
    public record UserView(Long id,String username,String fullName,String role,String taxEntityCode){
        public static UserView from(UserAccount u){return new UserView(u.getId(),u.getUsername(),u.getFullName(),u.getRole().name(),u.getTaxEntityCode());}
    }
    public record LoginResponse(String token,UserView user){}
}
