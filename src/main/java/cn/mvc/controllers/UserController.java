package cn.mvc.controllers;

import cn.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


//实现数据验证步骤
//加入hibernate-validator依赖
//注意要加入jar包
//需要验证javaBean的属性上面中加入对应的注解
@Controller
public class UserController {

    @PostMapping("/user")
    public String add(User user){
//        if(user.getId()==null||user.getId()==0){
//
//        }
        
        System.out.println(user);
        return "show";
    }
}
