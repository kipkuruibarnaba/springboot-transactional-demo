package com.springboottransactional.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:19 PM
 */
@Getter
@Setter
public class OrderResponse {
    private String orderTackingNumber;
    private String status;
    private String message;
}
