package com.springboottransactional.service;

import com.springboottransactional.dto.OrderRequest;
import com.springboottransactional.dto.OrderResponse;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:20 PM
 */
public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
