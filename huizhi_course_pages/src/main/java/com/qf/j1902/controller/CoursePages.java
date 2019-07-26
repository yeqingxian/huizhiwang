package com.qf.j1902.controller;

import com.qf.j1902.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class CoursePages {
    @Autowired
    CourseService courseService;
    @RequestMapping("/courselist")
    public ModelAndView courseList(){
        List menus = courseService.getMenu();
        ModelAndView mv = new ModelAndView();
        mv.addObject("menus",menus);
        mv.setViewName("courselist");
        return mv;
    }
}
