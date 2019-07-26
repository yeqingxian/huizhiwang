package com.edu.huizhi.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 封装datagrid组件需要的数据定义
 * Created by administrator on 2019/7/3.
 */
@Data
public class EasyuiDataGridResult implements Serializable{
    private long total;//总记录数
    private List<?> rows;//返回当前页结果集
}
