package com.example.demo.dto.response;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String name;
    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse(String token, String name, Collection<? extends GrantedAuthority> roles) {
        this.token = token;
        this.name = name;
        this.roles = roles;
    }


}
