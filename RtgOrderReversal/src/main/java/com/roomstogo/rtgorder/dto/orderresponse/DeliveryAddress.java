package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

@Data
public class DeliveryAddress {

    private String address1;
    private String address2;
    private String city;
    private String geocode;
    private String plus4;
    private String state;
    private String zip;
}
