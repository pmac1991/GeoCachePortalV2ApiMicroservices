package com.pm.GeoCacheMicro.UserService.Models.ApplicationUser.DTO;

import com.pm.GeoCacheMicro.UserService.Models.ApplicationUser.ApplicationRole;
import lombok.Data;

import java.util.List;

@Data
public class ApplicationUserResponseDTO {

    private Integer id;
    private String username;
    private String email;
    List<ApplicationRole> roles;

}
