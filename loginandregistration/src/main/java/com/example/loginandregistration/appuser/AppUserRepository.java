package com.example.loginandregistration.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long>{
    
    AppUser findByEmail(String email);
}
