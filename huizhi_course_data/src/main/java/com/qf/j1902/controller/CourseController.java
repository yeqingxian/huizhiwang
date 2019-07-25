package com.qf.j1902.controller;

import com.qf.j1902.pojo.Menu;
import com.qf.j1902.service.CourseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Controller
public class CourseController {
    @Autowired
    private CourseDataService courseDataService;
    @ResponseBody
    @RequestMapping(value = "/menus")
    public List getMenu(){
        List<Menu> menus = courseDataService.getCourseMenu();
        return menus;
    }
}
