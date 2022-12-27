package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

@Data
public class BillingAddress {

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;

}
