package cn.mvc.controllers;

import cn.mvc.entity.User;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/converter")
public class ConverterController {
        @RequestMapping("/test")
    public String test(User user){
        System.out.println(user);
        return "show";
    }

    @Test
    public void test01(){
            Date date=new Date("2020-8-8");
        System.out.println(date);
    }

}
