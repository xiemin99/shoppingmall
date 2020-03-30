package com.shoppingmall.customer.web;

import com.shoppingmall.customer.service.ICustomerService;
import com.shoppingmall.customer.vo.CustomerModel;
import com.shoppingmall.customer.vo.CustomerQueryModel;
import com.shoppingmall.utils.DateFormatHelper;
import com.shoppingmall.utils.JsonHelper;
import com.shoppingmall.utils.page.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.customer.web
 * @Version：1.0
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private ICustomerService customerService;

    @RequestMapping(value = "toQuery", method = RequestMethod.GET)
    public String toQuery(Model model,@RequestParam(value="queryJsonVal",defaultValue = "") String queryJsonVal){
        CustomerQueryModel queryModel = null;
        if (StringUtils.isEmpty(queryJsonVal)) {  // 表示为空
            queryModel = new CustomerQueryModel();
        } else {
            queryModel = (CustomerQueryModel) JsonHelper
                    .str2Class(queryJsonVal,CustomerQueryModel.class);
        }
        model.addAttribute("queryModel",queryModel);
        return "customer/query";
    }

    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(Model model,
                         @RequestParam(value="queryJsonVal",defaultValue = "") String queryJsonVal,
                         @ModelAttribute("page") Page page) {
        CustomerQueryModel queryModel = null;
        if (StringUtils.isEmpty(queryJsonVal)) {  // 表示为空
            queryModel = new CustomerQueryModel();
        } else {
            queryModel = (CustomerQueryModel) JsonHelper
                    .str2Class(queryJsonVal,CustomerQueryModel.class);
        }
        queryModel.setPage(page);
        Page dbPage = customerService.getByConditionPage(queryModel);
        model.addAttribute("page",dbPage);
        model.addAttribute("queryJsonVal",JsonHelper.strToJson(queryJsonVal));
        return "customer/list";
    }

    @RequestMapping(value = "toAdd", method = RequestMethod.GET)
    public String toAdd() {
        return "customer/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("customerModel") CustomerModel customerModel) {
        customerModel.setRegisterTime(DateFormatHelper.dateToStr(System.currentTimeMillis()));
        customerService.create(customerModel);
        return "customer/success";
    }

    @RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
    public String toUpdate(Model model,
                                 @PathVariable("customerUuid") Integer customerUuid) {
        CustomerModel customerModel = customerService.getById(customerUuid);
        model.addAttribute("customerModel", customerModel);
        return "customer/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute("customerModel") CustomerModel customerModel) {
        customerService.update(customerModel);
        return "customer/success";
    }

    @RequestMapping(value = "toDelete", method = RequestMethod.GET)
    public String toDelete(Model model,
                           @PathVariable("customerUuid") Integer customerUuid) {
        CustomerModel customerModel = customerService.getById(customerUuid);
        model.addAttribute("customerModel", customerModel);
        return "customer/success";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String delete(@RequestParam("customerUuid") Integer customerUuid) {
        customerService.delete(customerUuid);
        return "customer/success";
    }
}
