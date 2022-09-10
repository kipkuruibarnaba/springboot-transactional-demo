package com.springboottransactional.exception;

/**
 * @created Barnaba Mutai
 * @created 10/ 09/ 2022 - 4:31 PM
 */
public class PaymentException extends RuntimeException {
    public PaymentException(String message){
        super(message);
    }
}
