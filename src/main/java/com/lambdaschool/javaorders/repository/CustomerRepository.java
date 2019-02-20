package com.lambdaschool.javaorders.repository;

import com.lambdaschool.javaorders.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT c.custname as customer, o.ordnum, o.orddescription " +
            "       FROM customers c, orders o " +
            "       WHERE o.custcode = c.custcode " +
            "       ORDER BY c.custname",
                    nativeQuery = true)
    List<Object[]> customerOrders();




}
