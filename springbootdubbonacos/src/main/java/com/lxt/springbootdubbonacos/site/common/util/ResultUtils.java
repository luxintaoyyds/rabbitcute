package com.lxt.springbootdubbonacos.site.common.util;

import java.io.Serializable;

public class ResultUtils implements Serializable {
    private Integer code; // 状态码 0 表示成功，1表示处理中，-1表示失败
    private Object data; // 数据
    private String msg;// 描述

    public ResultUtils() {
    }

    public ResultUtils(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    // 成功，传入数据
    public static ResultUtils buildSuccess() {
        return new ResultUtils(0, null, "操作成功。。。");
    }

    // 成功，传入数据
    public static ResultUtils buildSuccess(Object data) {
        return new ResultUtils(0, data, "加载成功。。。");
    }

    // 失败，传入描述信息
    public static ResultUtils buildError(String msg) {
        return new ResultUtils(-1, null, msg);
    }

    // 失败，传入描述信息,状态码
    public static ResultUtils buildError(String msg, Integer code) {
        return new ResultUtils(code, null, msg);
    }

    // 成功，传入数据,及描述信息
    public static ResultUtils buildSuccess(Object data, String msg) {
        return new ResultUtils(0, data, msg);
    }

    // 成功，传入数据,及状态码
    public static ResultUtils buildSuccess(Object data, int code) {
        return new ResultUtils(code, data, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "JsonData [code=" + code + ", data=" + data + ", msg=" + msg
                + "]";
    }

}
