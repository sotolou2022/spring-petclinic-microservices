package com.roomstogo.rtgorder.dto.calendar;


import lombok.Data;

import java.util.List;

@Data
public class SplitCalendar {

    private String shipment;
    private List<String> skus;
    private String pickupWarehouse;
    private String transactionID;
    private String calendarType;
    private DeliveryCalendar deliveryCalendar;

}
