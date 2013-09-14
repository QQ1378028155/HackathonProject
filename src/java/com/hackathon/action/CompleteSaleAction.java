/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.CommentTypeCodeType;
import com.hackathon.api.CompleteSaleApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author hackathon
 */
public class CompleteSaleAction extends ActionSupport{
    private String itemID;
    private String transactionID;
    private String userID;
    private String commentText;
    private String shippingID;
    
    @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        CompleteSaleApi.execute(token, transactionID, commentText, CommentTypeCodeType.POSITIVE.value(), userID, itemID,shippingID);
        return null;
    }
    
    
    
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getShippingID() {
        return shippingID;
    }

    public void setShippingID(String shippingID) {
        this.shippingID = shippingID;
    }

    
}
