package com.roomstogo.rtgorder.dto.paymentinfo;

import lombok.Data;
 
@Data
public class PaymentInfo {

    private boolean authorized;

    private String paymentType;
 
    private PaymentProperties paymentProperties;
 
    private double authorizedAmount;
    
}
