package com.qf.j1902.service;

import com.qf.j1902.pojo.MsgResult;
import com.qf.j1902.pojo.SolrPojo;


/**
 * Created by Administrator on 2019/7/25.
 */
public interface SolrService {
    //将数据库数据导入solr
    MsgResult importDb2Solr();
    //根据传过来的关键字查询课程

}
