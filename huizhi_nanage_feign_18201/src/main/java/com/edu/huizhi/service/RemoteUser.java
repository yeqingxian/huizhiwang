package com.edu.huizhi.service;

import com.edu.huizhi.pojo.HuizhiUser;
import com.edu.huizhi.vo.EasyuiDataGridResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 陈松 (ye_qing_xian@163.com)
 * @date 2019/7/25 21:17
 */
@Service
@FeignClient(value = "manage-client")
public interface RemoteUser {
    @RequestMapping("/user/list")
    EasyuiDataGridResult findUser(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                  @RequestParam(value = "rows",defaultValue = "10")Integer pageSize);
    @RequestMapping("/user/findAll")
    List<HuizhiUser> findAllUser();
}
