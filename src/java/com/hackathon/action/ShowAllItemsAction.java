/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.ItemType;
import com.hackathon.api.HackList;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Tongda
 */
public class ShowAllItemsAction extends ActionSupport{
         @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        List<ItemType> allItemList = HackList.execute(token);
        context.put("allItemList", allItemList);
        return "success";
    }
    
}
