package com.balash.customer_orders.repository;

import com.balash.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author balash
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
