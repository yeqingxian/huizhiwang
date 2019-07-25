package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.CourseMapper;
import com.qf.j1902.pojo.Menu;
import com.qf.j1902.service.CourseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Service
public class CourseDataServiceImpl implements CourseDataService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Menu> getCourseMenu() {
        List<Menu> menus = courseMapper.getCourseMenu();
        return menus;
    }
}
