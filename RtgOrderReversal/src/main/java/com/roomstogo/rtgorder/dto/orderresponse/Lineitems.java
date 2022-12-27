package com.roomstogo.rtgorder.dto.orderresponse;

import lombok.Data;

@Data
public class Lineitems {

    private String price;
    private String lineitems;       // nothing populated from the json
    private int quantity;
    private String selectedmonogramfee;
    private String sku;
    private String skutitle;
    private String unitprotectionprice;
    private String unitprotectiontype;
    private String vendordescription;

}
