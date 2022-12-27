
package com.roomstogo.rtgorder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WarrantyPrice {
    
    private double price;

    @JsonProperty("provider_name")
    private String providerName;

    @JsonProperty("plan_name")
    private String planName;
}
