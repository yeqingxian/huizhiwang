package com.qf.j1902.controller;

import com.qf.j1902.pojo.MsgResult;
import com.qf.j1902.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/25.
 */
@Controller
public class SolrController {
    @Autowired
    private SolrService solrService;
    @RequestMapping("/solr/import")
    @ResponseBody
    public MsgResult import2Solr(){
        MsgResult msgResult = solrService.importDb2Solr();
        return msgResult;
    }
}
