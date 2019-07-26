package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.SolrMapper;
import com.qf.j1902.pojo.MsgResult;
import com.qf.j1902.pojo.SolrPojo;
import com.qf.j1902.pojo.SolrResult;
import com.qf.j1902.service.SolrService;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@Service
public class SolrServiceImpl implements SolrService{
    @Value("${solr.baseUrl}")
    private String baseUrl;
    @Autowired
    private SolrMapper solrMapper;
    @Override
    public MsgResult importDb2Solr() {
        MsgResult msgResult = new MsgResult();
        System.out.println(baseUrl);
        try {
        HttpSolrServer httpSolrServer = new HttpSolrServer(baseUrl);
        List<SolrResult> list = solrMapper.findAll();
            System.out.println(list);
        for (SolrResult solrResult:list) {
            SolrInputDocument document = new SolrInputDocument();
            document.setField("id", solrResult.getCourseId());
            document.setField("cb_name", solrResult.getCourseName());
            document.setField("category_name", solrResult.getCategoryName());
            document.setField("cb_desc", solrResult.getCourseDesc());
            httpSolrServer.add(document);
        }
            httpSolrServer.commit();//提交数据 到solr索引库中
            msgResult.setStatus(200);
            msgResult.setMessage("success");
            return msgResult;
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        msgResult.setStatus(-1);
        msgResult.setMessage("数据导入失败");
        return msgResult;
    }
}
