package com.edu.huizhi.controller;

import com.edu.huizhi.pojo.HuizhiUser;
import com.edu.huizhi.service.RemoteUser;
import com.edu.huizhi.vo.EasyuiDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 陈松 (ye_qing_xian@163.com)
 * @date 2019/7/25 21:40
 */
@RestController
public class HuiZhiUserController {
    @Autowired
    private RemoteUser remoteUser;
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public Object showUser(@RequestParam(value = "page", defaultValue = "1") Integer page,
                           @RequestParam(value = "rows", defaultValue = "10") Integer pageSize){
        EasyuiDataGridResult user = remoteUser.findUser(page, pageSize);
        return user;

    }

    @RequestMapping(value = "/user/edit",method = RequestMethod.GET)
    public Object showEdit(){
        return "";
    }
    /*@RequestMapping(value = "/user/list")
    public Object findAll(){
        List<HuizhiUser> allUser = remoteUser.findAllUser();
        return allUser;
    }*/
}
