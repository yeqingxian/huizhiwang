package com.edu.huizhi.service;

import com.edu.huizhi.pojo.Category;
import com.edu.huizhi.pojo.CategoryNode;
import com.edu.huizhi.pojo.CourseBase;

import java.util.List;

/**
 * Created by dongf on 2019/7/25.
 */
public interface CourseService {
    //查询所有的课程信息
    public List<CourseBase> findCourses();
    //查询出课程分类信息
    public List<CategoryNode> findCategoryNode();
    //查询课程分类信息
    public List<Category> findCategoryNodes(String id);
}
