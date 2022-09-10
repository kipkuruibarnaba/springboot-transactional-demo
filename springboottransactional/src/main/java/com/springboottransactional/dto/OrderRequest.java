package com.springboottransactional.dto;

import com.springboottransactional.entity.Order;
import com.springboottransactional.entity.Payment;
import lombok.Getter;
import lombok.Setter;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:19 PM
 */
@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
