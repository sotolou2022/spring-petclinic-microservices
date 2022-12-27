package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

@Data
public class Deposits {

    private String authorizationcode;
    private String authorizedamount;
    private String cashcode;

}
