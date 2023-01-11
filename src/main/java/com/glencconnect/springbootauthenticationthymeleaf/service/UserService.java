package com.glencconnect.springbootauthenticationthymeleaf.service;

import com.glencconnect.springbootauthenticationthymeleaf.model.User;
import com.glencconnect.springbootauthenticationthymeleaf.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
