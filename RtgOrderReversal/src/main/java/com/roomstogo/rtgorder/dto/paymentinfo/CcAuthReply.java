
package com.roomstogo.rtgorder.dto.paymentinfo;

import lombok.Data;
 
@Data
public class CcAuthReply {

    private int reasonCode;
    private String amount;
    private String authorizationCode;
    private String avsCode;
    private String avsCodeRaw;
    private String paymentNetworkTransactionID;
    private String authorizedDateTime;
    private String processorResponse;
    private String reconciliationID;
    
}
