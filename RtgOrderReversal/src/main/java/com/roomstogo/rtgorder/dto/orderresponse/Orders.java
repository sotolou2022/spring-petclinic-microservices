package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

import java.util.List;

@Data
public class Orders {

    private String abletoreschedule;
    private String additionaldirections;
    private String affiliatedata;
    private String balance;
    private BillingAddress billingaddress;
    private Customer customer;
    private DeliveryAddress deliveryaddress;
    private String deliverycharge;
    private String deliverydate;
    private String deliverytype;
    private List<Deposits[]> deposits;
    private String division;
    private String doorwaydelivery;
    private String emailaddress;
    private String estimateddeliverytimeframe;
    private String findeposits;
    private String financeaccountnumber;
    private String financeplan;
    private String gcdeposits;
    private String i95ind;
    private List<Lineitems> lineitems;
    private Notes notes;
    private String ordermessage;
    private String ordernumber;
    private String ordertotal;
    private String shippingwarehouse;
    private String status;
    private String storenumber;
    private String taxamount;
    private String taxareaid;


}
