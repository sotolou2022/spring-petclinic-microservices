package com.roomstogo.rtgorder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.roomstogo.rtgorder.dto.warranty.WarrantyPrice;
import lombok.Data;

import java.util.List;

@Data 
public class LineItems {

   private boolean warrantyEnabled;

//   private List<String> uvSequenceNumber;   remove not using anymore

   private boolean IsStoreSku;            // not found in promotions --> lineItems {}
   private String sku;
   private int quantity;
   private double unitPrice;

   private double bonusPrice;             // new
   private double bonusItemSavings;       //  new
   private String promotionItemSku;       // new

   private String title;
   private String deliveryType;
   private String category;
   private String type;                   //  missed on first pass. (is in both files)

   private PromotionSavings promotionSavings;      // new
   private String promotionStatus;        // new
   private String promotionId;            // new

   @JsonProperty("on_promotion")
   private boolean on_promotion;

   private int limitAvailable;            // new

   private List<ChildItems> childItems;   // did not see this in order.json file.

   private WarrantyPrice warrantyPrice;   // did not see this in order.json file.
    
}
