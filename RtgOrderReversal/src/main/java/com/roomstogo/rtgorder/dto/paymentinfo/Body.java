
package com.roomstogo.rtgorder.dto.paymentinfo;

import com.roomstogo.rtgorder.dto.PurchaseTotals;
import lombok.Data;
 
@Data
public class Body {

    private String merchantReferenceCode;

    private String requestID;
 
    private String decision;
 
    private int reasonCode;
 
    private String requestToken;
 
    private PurchaseTotals purchaseTotals;
 
    private CcAuthReply ccAuthReply;
 
    private AfsReply afsReply;
 
    private Card card;
 
    private RecurringSubscriptionInfo recurringSubscriptionInfo;
     
}
 