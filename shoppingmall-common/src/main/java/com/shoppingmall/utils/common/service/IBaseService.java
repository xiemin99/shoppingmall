package com.shoppingmall.utils.common.service;

import com.shoppingmall.utils.common.vo.BaseModel;
import com.shoppingmall.utils.page.Page;

import java.util.List;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils.service
 * @Version：1.0
 */
public interface IBaseService<E,C extends BaseModel<E>> {

    public void create(E e);
    public void update(E e);
    public void delete(Integer uuid);
    public E getById(Integer uuid);
    public Page<E> getByConditionPage(C c);

}
