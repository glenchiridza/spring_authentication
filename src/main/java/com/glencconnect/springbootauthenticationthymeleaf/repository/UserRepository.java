package com.glencconnect.springbootauthenticationthymeleaf.repository;

import com.glencconnect.springbootauthenticationthymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
