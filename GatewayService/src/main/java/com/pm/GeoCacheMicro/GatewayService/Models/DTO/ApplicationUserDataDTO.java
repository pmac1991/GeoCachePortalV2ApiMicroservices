package com.pm.GeoCacheMicro.GatewayService.Models.DTO;

import com.pm.GeoCacheMicro.GatewayService.Models.ApplicationRole;
import lombok.Data;

import java.util.List;

@Data
public class ApplicationUserDataDTO {
    private String username;
    private String email;
    List<ApplicationRole> roles;

}
