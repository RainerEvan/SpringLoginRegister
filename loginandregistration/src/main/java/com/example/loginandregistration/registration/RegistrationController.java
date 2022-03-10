package com.example.loginandregistration.registration;

import com.example.loginandregistration.appuser.AppUserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final AppUserService appUserService;

    public RegistrationController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @ModelAttribute("user")
    public RegistrationRequest request(){
        return new RegistrationRequest();
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") RegistrationRequest request){
        appUserService.register(request);
        return "redirect:/index";
    }
}
