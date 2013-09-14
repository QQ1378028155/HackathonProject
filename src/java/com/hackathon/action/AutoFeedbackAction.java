/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.FeedbackDetailType;
import com.hackathon.api.GetFeedbackApi;
import com.hackathon.api.RespondToFeedbackApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author hackathon
 */
public class AutoFeedbackAction extends ActionSupport{
    @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        String userID = (String) context.getSession().get("userID");
        FeedbackDetailType[] fdt = GetFeedbackApi.execute(token,userID);
        for(int i = 0;i < fdt.length;i ++)
        {
            RespondToFeedbackApi.execute(token, fdt[i].getFeedbackID(), fdt[i].getCommentingUser(),fdt[i].getItemID(),fdt[i].getTransactionID());
        }
        return null;
    }
}
