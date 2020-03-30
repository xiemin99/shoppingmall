package com.shoppingmall.utils.page;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils.page
 * @Version：1.0
 */
public class Page<E> implements Serializable {
    private int pageShow = 2;  // 每页显示多少条
    private int totalPage; // 总共有多少页
    private int totalCount; // 总共有多少条
    private int start; // 分页开始的条数  比如第二页从 10条开始
    private int nowPage;  // 当前是第几页
    private List<E> result = Collections.emptyList();

    public int getStart() {
        start = ( getNowPage() - 1 ) * getPageShow();
        if( start < 0 ){ start = 0; }
        return start;
    }

    public int getTotalPage() {
        return (int)Math.ceil( totalCount * 1.0 / pageShow );
    }

    public int getNowPage() {
        if ( nowPage <= 0 ){ nowPage = 1; }
        if ( nowPage > getTotalPage()){ nowPage = getTotalPage(); }
        return nowPage;
    }

    public void setStart(int start) {
        this.start = start;
    }
    public int getPageShow() {
        return pageShow;
    }

    public void setPageShow(int pageShow) {
        this.pageShow = pageShow;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public List<E> getResult() {
        return result;
    }

    public void setResult(List<E> result) {
        this.result = result;
    }
}
