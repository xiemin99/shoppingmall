package com.shoppingmall.utils.common.dao;

import java.util.List;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils.dao
 * @Version：1.0
 */

public interface BaseDAO<E,C> {

    public void create(E e);
    public void update(E e);
    public void delete(Integer uuid);
    public E getById(Integer uuid);
    public List<E> getByConditionPage(C c);

}
