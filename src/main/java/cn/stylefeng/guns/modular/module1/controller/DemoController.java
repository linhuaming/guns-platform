package cn.stylefeng.guns.modular.module1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping(value = "/demo")
    @ResponseBody
    public String demo(){
        return "hello world";
    }
}

