package com.glencconnect.springbootauthenticationthymeleaf.service;

import com.glencconnect.springbootauthenticationthymeleaf.model.User;
import com.glencconnect.springbootauthenticationthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
