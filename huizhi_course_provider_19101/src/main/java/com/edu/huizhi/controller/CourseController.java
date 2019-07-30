package com.edu.huizhi.controller;


import com.edu.huizhi.pojo.Category;
import com.edu.huizhi.pojo.CategoryNode;
import com.edu.huizhi.pojo.CourseBase;
import com.edu.huizhi.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongf on 2019/7/25.
 */
@RestController
@ApiModel
public class CourseController {
    @Autowired
    private CourseService courseService;
    //查询出已有的课程信息
    @RequestMapping(value = "/course/find")
    public List<CourseBase> findCourses(){
        List<CourseBase> courses = courseService.findCourses();
        return courses;
    }
    //查询出课程分类信息
    @RequestMapping(value = "/category/find",method = RequestMethod.POST)
    public List<CategoryNode> findCategoryNode(){
        List<CategoryNode> categoryNode = courseService.findCategoryNode();
        return categoryNode;
    }
    //查询课程分类信息
    @RequestMapping(value = "category/find/{value}",method = RequestMethod.POST)
    public Map<String,Object> findCategoryNodes(@RequestParam(value = "value")String id) {
        List<Category> categorys = courseService.findCategoryNodes(id);
        HashMap<String, Object> categoryMap = new HashMap<>();
        categoryMap.put("code","200");
        categoryMap.put("message","操作成功");
        categoryMap.put("data",categorys);
        return categoryMap;
    }
}
