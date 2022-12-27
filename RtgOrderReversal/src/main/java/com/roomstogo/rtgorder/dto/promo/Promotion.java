package com.roomstogo.rtgorder.dto.promo;

import lombok.Data;

@Data
public class Promotion {// @todo need to find a way to map promotions (inside of Promtions) to promotion at the class level
    private String amount;
    private String code;
    private String description;

}
