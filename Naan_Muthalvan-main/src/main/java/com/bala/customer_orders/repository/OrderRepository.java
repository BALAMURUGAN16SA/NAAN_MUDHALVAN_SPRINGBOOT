package com.balash.customer_orders.repository;

import com.balash.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author balash
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
