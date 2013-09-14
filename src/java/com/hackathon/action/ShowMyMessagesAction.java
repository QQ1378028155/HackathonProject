/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.MyMessagesMessageType;
import com.hackathon.api.GetMyMessagesApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
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
        
        System.out.println(myMessagesList.size());
        context.put("myMessagesList", myMessagesList);
        return "success";
    }
}
