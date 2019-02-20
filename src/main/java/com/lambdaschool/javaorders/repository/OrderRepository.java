package com.lambdaschool.javaorders.repository;

import com.lambdaschool.javaorders.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query(value = "SELECT *" +
            "       FROM orders o " +
            "       WHERE o.custcode = :custcode " +
            "       ORDER BY o.ordnum",
            nativeQuery = true)
    List<Order> findByCustCode(@Param("custcode") Long custcode);

    @Query(value = "SELECT *" +
            "       FROM orders o, customers c " +
            "       WHERE o.custcode = c.custcode AND c.custname = :name" +
            "       ORDER BY o.ordnum",
            nativeQuery = true)
    List<Order> findByCustName(@Param("name") String name);
}
