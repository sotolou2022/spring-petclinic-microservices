package com.roomstogo.rtgorder.dto.packsafe;

import lombok.Data;

@Data
public class Request {

    private String sig;
    private String et;
    private String vid;
    private Cus cus;
    private String sid;
    private String createdAt;
}