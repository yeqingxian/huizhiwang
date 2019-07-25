package com.qf.j1902.mapper;

import com.qf.j1902.pojo.SolrResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@Mapper
public interface SolrMapper {
    List<SolrResult> findAll();
}
