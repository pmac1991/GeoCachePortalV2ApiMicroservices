package com.pm.GeoCacheMicro.UserService.Controllers;


import com.pm.GeoCacheMicro.UserService.Models.ApplicationUser.ApplicationUser;
import com.pm.GeoCacheMicro.UserService.Models.ApplicationUser.DTO.ApplicationUserResponseDTO;
import com.pm.GeoCacheMicro.UserService.Services.ApplicationUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {


    @Autowired
    private ApplicationUserService userService;

    @Autowired
    private ModelMapper modelMapper;

    /*@PostMapping("/signin")

    public String login(//
                        @RequestParam String username, //
                        @RequestParam String password) {
        return userService.signin(username, password);
    }*/

    @PostMapping("/signup")
    public String signup(@RequestBody ApplicationUser user) {
        return userService.signup(modelMapper.map(user, ApplicationUser.class));
    }

    @DeleteMapping(value = "/{username}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String delete(@PathVariable String username) {
        userService.delete(username);
        return username;
    }

    @GetMapping(value = "/{username}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ApplicationUserResponseDTO search(@PathVariable String username) {
        return modelMapper.map(userService.search(username), ApplicationUserResponseDTO.class);
    }

    @GetMapping(value = "/me")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    public ApplicationUserResponseDTO whoami(HttpServletRequest req) {
        return modelMapper.map(userService.whoami(req), ApplicationUserResponseDTO.class);
    }

    @GetMapping("/refresh")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    public String refresh(HttpServletRequest req) {
        return userService.refresh(req.getRemoteUser());
    }


}
