package com.edu.huizhi.dao;

import com.edu.huizhi.pojo.Category;
import com.edu.huizhi.pojo.CategoryNode;
import com.edu.huizhi.pojo.CourseBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dongf on 2019/7/25.
 */
@Mapper
public interface CourseMapper{
    //查询出所有的进本课程
    public List<CourseBase> findCourses();
    //查询出课程分类信息
    public List<CategoryNode> findCategoryNode();
    //查询出课程分类信息
    public List<Category> findCategoryNodes(String id);
}
