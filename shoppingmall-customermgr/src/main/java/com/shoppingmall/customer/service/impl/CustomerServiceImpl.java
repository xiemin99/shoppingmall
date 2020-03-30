package com.shoppingmall.customer.service.impl;

import com.shoppingmall.customer.dao.CustomerDAO;
import com.shoppingmall.customer.service.ICustomerService;
import com.shoppingmall.customer.vo.CustomerModel;
import com.shoppingmall.customer.vo.CustomerQueryModel;
import com.shoppingmall.utils.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.customer.service.impl
 * @Version：1.0
 */
@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<CustomerModel, CustomerQueryModel>
        implements ICustomerService {

    private CustomerDAO customerDAO;

    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
        super.setBaseDAO(this.customerDAO);
    }
}
