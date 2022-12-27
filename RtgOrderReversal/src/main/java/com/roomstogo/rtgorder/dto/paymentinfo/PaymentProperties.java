package com.roomstogo.rtgorder.dto.paymentinfo;

import lombok.Data;
 
@Data
public class PaymentProperties {
    
    private String token;
    private Card card;
    private Body body;
    private int reasonCode;
    private String status;
}
