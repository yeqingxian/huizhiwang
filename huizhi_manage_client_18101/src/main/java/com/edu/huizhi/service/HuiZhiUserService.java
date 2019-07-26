package com.edu.huizhi.service;

import com.edu.huizhi.pojo.HuizhiUser;
import com.edu.huizhi.vo.EasyuiDataGridResult;

import java.util.List;

/**
 * @author 陈松 (ye_qing_xian@163.com)
 * @date 2019/7/25 16:07
 */
public interface HuiZhiUserService {

    EasyuiDataGridResult findHuiZhiUser(Integer page,Integer pageSize);

    List<HuizhiUser> selectByExample();

}
