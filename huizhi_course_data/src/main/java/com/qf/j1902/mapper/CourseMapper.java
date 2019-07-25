package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/7/24.
 */
@Mapper
public interface CourseMapper {
    List<Menu> getCourseMenu();
}
