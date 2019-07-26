package com.qf.j1902.pojo;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2019/7/25.
 */
@Data
public class MsgResult {
    private Integer status;
    private String message;
    private List<?> data;
}
