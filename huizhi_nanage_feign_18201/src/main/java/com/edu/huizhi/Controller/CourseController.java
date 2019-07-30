package com.edu.huizhi.Controller;

import com.edu.huizhi.pojo.Category;
import com.edu.huizhi.pojo.CategoryNode;
import com.edu.huizhi.pojo.CourseBase;
import com.edu.huizhi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by dongf on 2019/7/25.
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    //跳转添加
    @RequestMapping(value = "/course/add",method = RequestMethod.GET)
    public String addCourse(){
        return "/courseadd";
    }
    @RequestMapping(value = "/course/edit",method = RequestMethod.GET)
    public String editCourse(){
        return "/courseedit";
    }
    //查询所有的课程信息
    @ResponseBody
    @RequestMapping(value = "/course/find",method = RequestMethod.POST)
    public List<CourseBase> findCourses(){
        List<CourseBase> courses = courseService.findCourses();
        System.out.println(courses);
        return courses;
    }
    //查询出课程的分类信息
    @ResponseBody
    @RequestMapping(value = "/category/find",method = RequestMethod.POST)
    public List<CategoryNode> findCategoryNode(){
        List<CategoryNode> categoryNode = courseService.findCategoryNode();
        return categoryNode;
    }
    //查询出课程的分类信息
    @ResponseBody
    @RequestMapping(value = "/category/find/{value}",method = RequestMethod.POST)
    public Map<String,Object> findCategoryNodes(@RequestParam(value = "value")String id){
        Map<String, Object> categoryNodes = courseService.findCategoryNodes(id);
        return categoryNodes;
    }
}
