package com.roomstogo.rtgorder.dto;

import lombok.Data;
 
@Data
public class ShippingAddress {

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country_code;
    private boolean addressLookupSuccess;
    private String globalAddressId;
    private String county;

}
