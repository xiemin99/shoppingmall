package com.shoppingmall.customer.test;

import com.shoppingmall.customer.service.ICustomerService;
import com.shoppingmall.customer.vo.CustomerModel;
import com.shoppingmall.customer.vo.CustomerQueryModel;
import com.shoppingmall.utils.page.Page;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.customer.test
 * @Version：1.0
 */
@Service
@Transactional
public class TestService {

    @Resource
    private ICustomerService service = null;

    public ICustomerService getService(){
        return service;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TestService test = (TestService) context.getBean("testService");

        CustomerQueryModel customerModel = new CustomerQueryModel();
        customerModel.getPage().setNowPage(2);
        customerModel.getPage().setPageShow(3);
        Page<CustomerModel> list = test.getService().getByConditionPage(customerModel);
        System.out.println(list.getResult());
        Page<CustomerModel> list2 = test.getService().getByConditionPage(customerModel);
        System.out.println(list2.getResult());
    }
}
