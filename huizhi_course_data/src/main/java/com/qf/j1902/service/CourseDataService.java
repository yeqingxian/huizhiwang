package com.qf.j1902.service;

import com.qf.j1902.pojo.Menu;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Component
public interface CourseDataService {
    List<Menu> getCourseMenu();
}
