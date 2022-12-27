package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

@Data
public class Riskified {

    private String id;
    private String status;
    private String oldStatus;
    private String description;
    private String decisionCode;
    private String decisionTimestamp;

}
