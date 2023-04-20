package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ControllerTest implements Controller {
    
    @Override
    public ModelAndView handleRequest (HttpServletRequest arg0, HttpServletResponse arg1) throws Excepiton{
        ModelAndView m = new ModelAndView();
        
        m.addObject("msg", "第一个spring程序");
        
        m.setViewName("/WEB-INF/jsp/first.jsp");
        return m;
    }
    
}
