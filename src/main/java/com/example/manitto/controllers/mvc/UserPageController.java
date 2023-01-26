package com.example.manitto.controllers.mvc;

import com.example.manitto.common.LoginSessionManager;
import com.example.manitto.dtos.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jonghyeon on 2023/01/21,
 * Package : com.example.manitto.controllers.mvc
 */
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserPageController {
    private final LoginSessionManager loginSessionManager;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @GetMapping("/index")
    public String indexform() {
        return "index";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/main")
    public String mainPage() {
        User.InfoDto info = loginSessionManager.getLoginUserInfo();
        
        
        if (info == null) return loginPage();
        if (!info.getAwareRole()) return "role-check";
        return "main";
    }

    @GetMapping("/match-list")
    public String matchList() {
        return "match-list";
    }
}
