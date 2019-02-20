package com.lambdaschool.javaorders;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repository.AgentRepository;
import com.lambdaschool.javaorders.repository.CustomerRepository;
import com.lambdaschool.javaorders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrdersController {

    @Autowired
    CustomerRepository custrepos;

    @Autowired
    AgentRepository agentrepos;

    @Autowired
    OrderRepository orderrepos;

    @GetMapping("/customer/order")
    public List<Object[]> customerOrders(){
        return custrepos.customerOrders();
    }

    @GetMapping("/customer/name/{custname}")
    public List<Order> custName(String name){
        return orderrepos.findByCustName(name);
    }

    @GetMapping("/customer/code/{custcode}")
    public List<Order> custCodes(Long custcode){
        return orderrepos.findByCustCode(custcode);
    }

}
