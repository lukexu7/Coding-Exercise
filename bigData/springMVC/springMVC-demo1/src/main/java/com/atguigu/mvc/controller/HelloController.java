package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2022/3/9 10:49
 */

@Controller
public class HelloController {

    @RequestMapping(value="/")
    public String index (){
        return "index";
    }
}
