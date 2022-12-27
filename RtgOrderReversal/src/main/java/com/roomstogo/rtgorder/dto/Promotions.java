

package com.roomstogo.rtgorder.dto;

import com.roomstogo.rtgorder.dto.promo.Promotion;
import lombok.Data;

import java.util.List;

 
@Data
public class Promotions {
    
    private double cartTotal;
    private double listPriceTotal;
    private double salePriceTotal;
    private double bonusBuyTotal;
    private double totalSavings;
    private List<LineItems> lineItems;
    private List<Promotion> promotions;            // these are showing empty arrays "promotions": []
    private List<String> amountPromotions;      // this is not in orders.json,


}
