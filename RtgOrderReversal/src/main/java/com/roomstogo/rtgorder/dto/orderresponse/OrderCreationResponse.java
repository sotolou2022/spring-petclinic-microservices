package com.roomstogo.rtgorder.dto.orderresponse;


import lombok.Data;

@Data
public class OrderCreationResponse {

    private Createorderresult createorderresult;
    private Status status;
    private Riskified riskified;

}
