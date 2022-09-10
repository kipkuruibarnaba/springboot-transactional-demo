package com.springboottransactional.service.impl;

import com.springboottransactional.dto.OrderRequest;
import com.springboottransactional.dto.OrderResponse;
import com.springboottransactional.entity.Order;
import com.springboottransactional.entity.Payment;
import com.springboottransactional.exception.PaymentException;
import com.springboottransactional.repository.OrderRepository;
import com.springboottransactional.repository.PaymentRepository;
import com.springboottransactional.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:21 PM
 */
@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}
