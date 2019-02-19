package com.lambdaschool.javaorders;

import com.lambdaschool.javaorders.repository.AgentRepository;
import com.lambdaschool.javaorders.repository.CustomerRepository;
import com.lambdaschool.javaorders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrdersController {

    @Autowired
    CustomerRepository custrepos;

    @Autowired
    AgentRepository agentrepos;

    @Autowired
    OrderRepository orderrepos;
}
