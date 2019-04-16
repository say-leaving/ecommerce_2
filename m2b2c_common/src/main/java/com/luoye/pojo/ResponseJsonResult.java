package com.luoye.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回前端数据通用模板
 */
public class ResponseJsonResult {
    private int status=200;
    private Object object;
    private String msg;
    private List<?> list =new ArrayList<Object>();

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
