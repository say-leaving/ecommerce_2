package com.luoye.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回表格数据通用模板
 * @param <T>
 */
public class PageDataTemplate<T> {
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    private long total;
    private List<T> rows =new ArrayList<>();


}
