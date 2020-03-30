package com.shoppingmall.utils.common.vo;

import com.shoppingmall.utils.page.Page;

import java.io.Serializable;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils.vo
 * @Version：1.0
 */
public class BaseModel<M> implements Serializable {

    private Page<M> page = new Page<M>();

    public Page<M> getPage() {
        return page;
    }

    public void setPage(Page<M> page) {
        this.page = page;
    }
}
