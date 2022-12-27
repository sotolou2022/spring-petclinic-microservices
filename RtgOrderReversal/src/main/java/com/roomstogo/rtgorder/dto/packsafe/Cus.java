package com.roomstogo.rtgorder.dto.packsafe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Cus {

    @JsonProperty("first_name")
    private String firstName;  // has underscore
    @JsonProperty("last_name")
    private String lastName;    // has underscore
    private String orderId;
    private String browserIP;
    private String userAgent;
    private String referrer;
    @JsonProperty("session_id")
    private String sessionId;   // has underscore
    private String source;

}
