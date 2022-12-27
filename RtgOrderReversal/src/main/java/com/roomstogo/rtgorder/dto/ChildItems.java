
package com.roomstogo.rtgorder.dto;

import lombok.Data;
 
@Data
public class ChildItems {
    
    private String sku;

    private int quantity;
 
    private String price;
 
    private String title;
 
    private WarrantyPrice warrantyPrice;
}
