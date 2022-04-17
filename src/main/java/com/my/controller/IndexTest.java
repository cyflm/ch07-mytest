package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hogan
 * @time 2022-04-16 8:21
 */
@Controller
public class IndexTest {
    /*@RequestMapping("/index")
    public ModelAndView test01() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }*/

    @RequestMapping("/test")
    @ResponseBody
    public String showMainPage() {
        return "test";
    }

    public void test1() {

    }
}
