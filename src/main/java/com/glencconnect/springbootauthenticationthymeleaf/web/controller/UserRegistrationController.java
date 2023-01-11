package com.glencconnect.springbootauthenticationthymeleaf.web.controller;

import com.glencconnect.springbootauthenticationthymeleaf.service.UserServiceImpl;
import com.glencconnect.springbootauthenticationthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserServiceImpl userService;

    @Autowired
    public UserRegistrationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
