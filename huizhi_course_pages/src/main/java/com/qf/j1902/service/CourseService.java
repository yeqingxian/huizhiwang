package com.qf.j1902.service;

import com.qf.j1902.service.impl.CourseServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@FeignClient(value = "course-data",fallback = CourseServiceImpl.class)
public interface CourseService {
    @RequestMapping(value = "/menus")
    List getMenu();
}
