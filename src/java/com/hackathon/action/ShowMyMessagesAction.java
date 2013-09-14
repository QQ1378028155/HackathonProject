/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.MessageTypeCodeType;
import com.ebay.soap.eBLBaseComponents.MyMessagesMessageType;
import com.hackathon.api.GetMyMessagesApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WingFung
 */
public class ShowMyMessagesAction extends ActionSupport{
    @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        List<MyMessagesMessageType> myMessagesList = GetMyMessagesApi.execute(token);
        List<MyMessagesMessageType> msgElse = new ArrayList();
        List<MyMessagesMessageType> msgMember = new ArrayList();
        for (int i=0;i<myMessagesList.size();i++){
            MessageTypeCodeType mt=myMessagesList.get(i).getMessageType();
            if (mt!=null && mt.toString().compareTo("")!=0)
                msgMember.add(myMessagesList.get(i));
            else
                msgElse.add(myMessagesList.get(i));
        }

        context.put("eMsgList", msgElse);
        context.put("mMsgList", msgMember);
        return "success";
    }
}
