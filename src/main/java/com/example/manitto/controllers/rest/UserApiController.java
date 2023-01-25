package com.example.manitto.controllers.rest;

import com.example.manitto.common.LoginSessionManager;
import com.example.manitto.dtos.User;
import com.example.manitto.services.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonghyeon on 2023/01/21,
 * Package : com.example.manitto.controllers.rest
 */
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor

public class UserApiController {
    private final UserService service;

    private final LoginSessionManager loginSessionManager;

    @PostMapping
    public void registerUser(User.RegisterDto registerDto) {
        service.registerUser(registerDto);
    }

    @PostMapping("/login")
    public void login(User.AuthDto authDto) {
    	System.out.println("로그인");
        service.login(authDto);
    }

    @GetMapping("/logout")
    public void logout() {
    	System.out.println("로그아웃");
    }
    
    @PutMapping("/role")
    public String getUserRole() {
        User.InfoDto info = loginSessionManager.getLoginUserInfo();
        return service.getUserRole(info.getId());
    }
}
