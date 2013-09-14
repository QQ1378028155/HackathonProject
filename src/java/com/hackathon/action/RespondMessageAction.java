/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.MemberMessageExchangeType;
import com.ebay.soap.eBLBaseComponents.MemberMessageType;
import com.hackathon.api.AddMemberMessageRTQApi;
import com.hackathon.api.GetMemberMessagesApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author WingFung
 */
public class RespondMessageAction  extends ActionSupport {
    
    String itemID;
    String emID;
    String responseContent;
    
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }

    public String getEmID() {
        return emID;
    }

    public void setEmID(String emID) {
        this.emID = emID;
    }
    
    @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        List<MemberMessageExchangeType> mMessages = GetMemberMessagesApi.execute(token,itemID);
        System.out.println("########"+mMessages.size());
        for (MemberMessageExchangeType msg : mMessages){
            if (emID.compareTo(msg.getQuestion().getMessageID())==0){
                MemberMessageType mmt = new MemberMessageType();
                mmt.setParentMessageID(msg.getQuestion().getMessageID());
                String[] rid = new String[]{msg.getQuestion().getSenderID()};
                mmt.setRecipientID(rid);
                mmt.setBody(responseContent);
                AddMemberMessageRTQApi.execute(token, mmt);
                break;
            }
        }
        return "success";
    }
}
