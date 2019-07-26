package com.edu.huizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dongf on 2019/7/25.
 */
@Controller
public class CourseController {
    //跳转添加
    @RequestMapping(value = "/course/add",method = RequestMethod.GET)
    public String addCourse(){
        return "/courseadd";
    }
    @RequestMapping(value = "/course/edit",method = RequestMethod.GET)
    public String editCourse(){
        return "/courseedit";
    }
}
