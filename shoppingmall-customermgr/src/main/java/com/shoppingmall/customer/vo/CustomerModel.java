package com.shoppingmall.customer.vo;

import lombok.Data;
import com.shoppingmall.utils.common.vo.BaseModel;

import java.io.Serializable;

/**
 * @Author：xie_min
 * @Date：2020-3-29
 * @Descrption：com.shoppingmall.customer.vo
 * @Version：1.0
 */
@Data
public class CustomerModel extends BaseModel<CustomerModel> {

    private Integer uuid;//` int(11) NOT NULL AUTO_INCREMENT,
    private String customerId;//` varchar(20) DEFAULT NULL,
    private String pwd;//` varchar(20) DEFAULT NULL,
    private String showName;//` varchar(100) DEFAULT NULL,
    private String trueName;//` varchar(100) DEFAULT NULL,
    private String registerTime;//` varchar(100) DEFAULT NULL

    @Override
    public String toString() {
        return "CustomerModel{" +
                "uuid=" + uuid +
                ", customerId='" + customerId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", showName='" + showName + '\'' +
                ", trueName='" + trueName + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
