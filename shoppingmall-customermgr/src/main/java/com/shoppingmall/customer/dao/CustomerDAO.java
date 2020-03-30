package com.shoppingmall.customer.dao;

import com.shoppingmall.customer.vo.CustomerModel;
import com.shoppingmall.customer.vo.CustomerQueryModel;
import com.shoppingmall.utils.common.dao.BaseDAO;
import org.springframework.stereotype.Repository;

/**
 * @Author：xie_min
 * @Date：2020-3-29
 * @Descrption：com.shoppingmall.customer.dao
 * @Version：1.0
 */

@Repository  // 因为加了这个注解是对应配置文件
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel> {

}
