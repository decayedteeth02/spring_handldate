package cn.mvc.controllers;

import cn.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("/user")
    public String add(User user){
        System.out.println(user);
        return "show";
    }
}
