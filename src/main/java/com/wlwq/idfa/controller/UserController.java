package com.wlwq.idfa.controller;

import com.wlwq.idfa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public Object test(@RequestParam("nickName") String nickName) {
        return userService.selectOneByNickname(nickName);
    }

    @RequestMapping("/test1")
    public Object test1(@RequestParam("username") String username) {
        return userService.selectOneByUsername2( username );
    }

    @RequestMapping("/test2")
    public Object test2(@RequestParam("username") String username) {
        return userService.selectOneByUsername3( username );
    }

}
