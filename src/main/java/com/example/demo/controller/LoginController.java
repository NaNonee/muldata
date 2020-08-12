package com.example.demo.controller;

import com.example.demo.annotation.OperLog;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/add")
    @OperLog(operModul = "人员管理",operDesc = "增加人员",operType = "")
    public int add(User user) {
        return userService.add(user);
    }

    @PostMapping(value="/findPage")
    public Object findPage(@RequestBody PageRequest pageQuery) {
        return userService.findPage(pageQuery);
    }

}
