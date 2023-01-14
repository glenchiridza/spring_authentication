package com.glencconnect.springbootauthenticationthymeleaf.service;

import com.glencconnect.springbootauthenticationthymeleaf.model.Role;
import com.glencconnect.springbootauthenticationthymeleaf.model.User;
import com.glencconnect.springbootauthenticationthymeleaf.repository.UserRepository;
import com.glencconnect.springbootauthenticationthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                List.of(new Role("ROLE_USER"))
        );

        return userRepository.save(user);
    }
}
