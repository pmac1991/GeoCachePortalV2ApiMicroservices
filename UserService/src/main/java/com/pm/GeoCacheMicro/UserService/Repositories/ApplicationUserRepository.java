package com.pm.GeoCacheMicro.UserService.Repositories;

import com.pm.GeoCacheMicro.UserService.Models.ApplicationUser.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    boolean existsByUsername(String username);

    ApplicationUser findByUsername(String username);

    @Transactional
    void deleteByUsername(String username);
}
