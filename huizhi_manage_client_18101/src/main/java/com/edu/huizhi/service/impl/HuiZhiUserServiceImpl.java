package com.edu.huizhi.service.impl;

import com.edu.huizhi.mapper.HuizhiUserMapper;
import com.edu.huizhi.pojo.HuizhiUser;
import com.edu.huizhi.pojo.HuizhiUserExample;
import com.edu.huizhi.service.HuiZhiUserService;
import com.edu.huizhi.vo.EasyuiDataGridResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈松 (ye_qing_xian@163.com)
 * @date 2019/7/25 16:09
 */
@Service
public class HuiZhiUserServiceImpl implements HuiZhiUserService {
    @Autowired
    private HuizhiUserMapper huizhiUserMapper;
    @Override
    public EasyuiDataGridResult findHuiZhiUser(Integer page, Integer pageSize) {
        EasyuiDataGridResult dataGridResult = new EasyuiDataGridResult();
        HuizhiUserExample example = new HuizhiUserExample();

        PageHelper.startPage(page,pageSize);
        List<HuizhiUser> huizhiUsers = huizhiUserMapper.selectByExample(example);
        PageInfo<HuizhiUser> pageInfo = new PageInfo<>(huizhiUsers);
        dataGridResult.setRows(huizhiUsers);
        long total = pageInfo.getTotal();
        dataGridResult.setTotal(total);
        return dataGridResult;
    }

    @Override
    public List<HuizhiUser> selectByExample() {
        HuizhiUserExample example = new HuizhiUserExample();
        return huizhiUserMapper.selectByExample(example);
    }
}
