package com.edu.huizhi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈松 (ye_qing_xian@163.com)
 * @date 2019/7/23 19:28
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "login.html";
    }
    @RequestMapping("/{page}")
    public  String showPage(@PathVariable("page")String page){
        return page;
    }
}
