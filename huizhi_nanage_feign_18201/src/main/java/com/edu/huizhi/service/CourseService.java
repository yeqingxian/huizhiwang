package com.edu.huizhi.service;

import com.edu.huizhi.pojo.Category;
import com.edu.huizhi.pojo.CategoryNode;
import com.edu.huizhi.pojo.CourseBase;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by dongf on 2019/7/25.
 */
@FeignClient(value = "course-provider")
public interface CourseService {
    //查询出所有的基本课程
    @RequestMapping(value = "/course/find",method = RequestMethod.POST)
    public List<CourseBase> findCourses();
    @RequestMapping(value = "/category/find",method = RequestMethod.POST)
    public List<CategoryNode> findCategoryNode();
    //查询出课程分类信息
    @RequestMapping(value = "/category/find/{value}",method = RequestMethod.POST)
    public Map<String,Object> findCategoryNodes(@RequestParam(value = "value")String id);
}
