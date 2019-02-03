package com.pm.GeoCacheMicro.AuthService.Models.ApplicationUser.DTO;

import com.pm.GeoCacheMicro.AuthService.Models.ApplicationUser.ApplicationRole;
import lombok.Data;

import java.util.List;

@Data
public class ApplicationUserDataDTO {
    private String username;
    private String email;
    List<ApplicationRole> roles;

}
