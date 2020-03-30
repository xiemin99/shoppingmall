package com.shoppingmall.utils.common.service.impl;

import com.shoppingmall.utils.common.dao.BaseDAO;
import com.shoppingmall.utils.common.service.IBaseService;
import com.shoppingmall.utils.common.vo.BaseModel;
import com.shoppingmall.utils.page.Page;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils.service.impl
 * @Version：1.0
 */
public class BaseServiceImpl<E,C extends BaseModel<E>> implements IBaseService<E,C> {

    private BaseDAO baseDAO;

    public void setBaseDAO(BaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }

    @Override
    public void create(E e) {
        baseDAO.create(e);
    }

    @Override
    public void update(E e) {
        baseDAO.update(e);
    }

    @Override
    public void delete(Integer uuid) {
        baseDAO.delete(uuid);
    }

    @Override
    public E getById(Integer uuid) {
        return (E)baseDAO.getById(uuid);
    }

    @Override
    public Page<E> getByConditionPage(C c) {
        List<E> list = baseDAO.getByConditionPage(c);
        c.getPage().setResult(list);
        return c.getPage();
    }
}
