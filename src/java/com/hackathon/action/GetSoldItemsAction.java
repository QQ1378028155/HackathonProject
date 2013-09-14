/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.OrderTransactionType;
import com.ebay.soap.eBLBaseComponents.RequiredSellerActionCodeType;
import com.ebay.soap.eBLBaseComponents.TransactionType;
import com.hackathon.api.GetMyEbaySellingApi;
import com.hackathon.api.GetSellerTransactionsApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author hackathon
 */
public class GetSoldItemsAction extends ActionSupport {

    @Override
    public String execute() {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");

        TransactionType[] tt = GetSellerTransactionsApi.execute(token);
        List<TransactionType> ttList = new ArrayList<TransactionType>();

        HttpServletRequest request = ServletActionContext.getRequest();
        String mode = request.getParameter("mode");
        for (int i = 0; i < tt.length; i++) {
            if (mode.equals("all")) {
                ttList.add(tt[i]);
            }
            
            if (mode.equals("notShipped")) {
                try {
                    RequiredSellerActionCodeType[] rsac = tt[i].getPaymentHoldDetails().getRequiredSellerActionArray().getRequiredSellerAction();
                    int j;
                    for (j = 0; j < rsac.length; j++) {
                        if (rsac[j].equals(RequiredSellerActionCodeType.MARK_AS_SHIPPED)) {
                            break;
                        }
                    }
                    if (j == rsac.length) {
                        ttList.add(tt[i]);
                    }
                } catch (Exception e) {
                    ttList.add(tt[i]);
                }
            }
            if (mode.equals("noFeedback")) {
                if (tt[i].getFeedbackReceived() == null) {
                    ttList.add(tt[i]);
                }
            }
        }
        context.put("ttList", ttList);
        return "success";
    }
}
