package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

import java.util.List;

@Data
public class Createorderresult {

    private String signature;
    private List<Orders> orders;

}
