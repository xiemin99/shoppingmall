package com.shoppingmall.customer.service;

import com.shoppingmall.customer.vo.CustomerModel;
import com.shoppingmall.customer.vo.CustomerQueryModel;
import org.springframework.stereotype.Service;
import com.shoppingmall.utils.common.service.IBaseService;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.customer.service
 * @Version：1.0
 */
public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel> {
}
