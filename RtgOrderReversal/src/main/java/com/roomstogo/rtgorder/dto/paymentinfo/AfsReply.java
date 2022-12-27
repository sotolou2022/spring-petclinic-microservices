package com.roomstogo.rtgorder.dto.paymentinfo;

import lombok.Data;

@Data
public class AfsReply {

    private int reasonCode;
    private String consumerLocalTime;
    private String scoreModelUsed;
    private int afsResult;
    private String cardBin;
    private String binCountry;
    private String cardAccountType;
    private String cardScheme;
    private String cardIssuer;
    
}

