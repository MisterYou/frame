package com.youjin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by youjin on 2017/10/31.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    @ResponseBody
    public String test(){

        System.out.println("1111");
        return "hello";
    }
}
