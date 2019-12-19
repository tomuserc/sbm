package com.wlwq.idfa.controller;

import com.wlwq.idfa.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Api(tags={"测试"})
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/test")
    public Object test() {
        return userService.findAllData();
    }

    @PostMapping("/testdb2")
    public Object testdb2() {
        return userService.findAllDataDb2();
    }

    @PostMapping("/testdb3")
    public Object testdb3() {
        return userService.findAllDataDb3();
    }

    @PostMapping("/delete")
    public Object delete(@RequestParam("id") Long id) {
        return userService.deleteById(id);
    }
}
