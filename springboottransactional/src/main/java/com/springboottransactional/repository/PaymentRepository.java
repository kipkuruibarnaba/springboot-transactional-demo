package com.springboottransactional.repository;

import com.springboottransactional.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:17 PM
 */
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
