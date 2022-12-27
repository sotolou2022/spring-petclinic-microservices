package com.roomstogo.rtgorder.dto.calendar;

import lombok.Data;

import java.util.List;

@Data
public class DeliveryCalendar {

    private List<String> expressDeliveryDates;
    private String expressDeliveryDate;
    private List<String> deliveryDates;
    private List<String> pickupDates;


}
