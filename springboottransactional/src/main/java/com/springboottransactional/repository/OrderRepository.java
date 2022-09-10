package com.springboottransactional.repository;

import com.springboottransactional.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:16 PM
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
}
