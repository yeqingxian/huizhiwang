package com.edu.huizhi.controller;

import com.edu.huizhi.pojo.HuizhiUser;
import com.edu.huizhi.service.HuiZhiUserService;
import com.edu.huizhi.vo.EasyuiDataGridResult;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 陈松 (ye_qing_xian@163.com)
 * @date 2019/7/25 16:29
 */
@RestController
public class HuiZhiUserController {
    @Autowired
    private HuiZhiUserService huiZhiUserService;

    @ApiModelProperty
    @RequestMapping("/user/list")
    public Object showUser(@RequestParam(value = "page", defaultValue = "1") Integer page,
                           @RequestParam(value = "rows", defaultValue = "10") Integer pageSize){
        EasyuiDataGridResult huiZhiUser = huiZhiUserService.findHuiZhiUser(page, pageSize);
        return huiZhiUser;
    }
    @ApiModelProperty
    @RequestMapping("/user/findAll")
    public Object showUserAll(){
        List<HuizhiUser> huizhiUsers = huiZhiUserService.selectByExample();
        return huizhiUsers;
    }

}
