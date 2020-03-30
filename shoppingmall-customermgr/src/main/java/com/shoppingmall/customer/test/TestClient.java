package com.shoppingmall.customer.test;

import com.shoppingmall.customer.dao.CustomerDAO;
import com.shoppingmall.customer.vo.CustomerModel;
import com.shoppingmall.customer.vo.CustomerQueryModel;
import com.shoppingmall.utils.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.customer.test
 * @Version：1.0
 */
@Service("testClient")
public class TestClient {
    @Autowired
    private CustomerDAO customerDAO = null;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TestClient testClient = (TestClient) context.getBean("testClient");
//        CustomerModel model = new CustomerModel();
//        model.setCustomerId("123");
//        model.setPwd("123456");
//        model.setShowName("zhangsan");
//        model.setTrueName("true");
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        model.setRegisterTime(format.format(new Date()));
//        testClient.customerDAO.create(model);
        CustomerQueryModel customerModel = new CustomerQueryModel();
        customerModel.getPage().setNowPage(2);
        customerModel.getPage().setPageShow(3);
        List<CustomerModel> list = testClient.customerDAO.getByConditionPage(customerModel);
        System.out.println(list.toString());

        List<CustomerModel> list1 = testClient.customerDAO.getByConditionPage(customerModel);
        System.out.println(list1.toString());
    }
}
