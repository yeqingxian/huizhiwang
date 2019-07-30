package com.edu.huizhi.service.impl;

import com.edu.huizhi.dao.CourseMapper;
import com.edu.huizhi.pojo.Category;
import com.edu.huizhi.pojo.CategoryNode;
import com.edu.huizhi.pojo.CourseBase;
import com.edu.huizhi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongf on 2019/7/25.
 */
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseMapper courseMapper;
    //查询所有的课程
    @Override
    public List<CourseBase> findCourses() {

        List<CourseBase> courses = courseMapper.findCourses();
        return courses;
    }
     //查询出课程分类信息
    @Override
    public List<CategoryNode> findCategoryNode() {
        List<CategoryNode> categoryNode = courseMapper.findCategoryNode();
        return categoryNode;
    }

    @Override
    public List<Category> findCategoryNodes(String id) {
        List<Category> categorys = courseMapper.findCategoryNodes(id);
        return categorys;
    }
}
