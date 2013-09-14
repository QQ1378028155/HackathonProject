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
public class ShowActiveItemsAction extends ActionSupport{
         @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        List<ItemType> activeItemList = HackList.execute(token);
        for(int i=0; i<activeItemList.size(); i++)
        {
                if(!activeItemList.get(i).getSellingStatus().getListingStatus().toString().equals("ACTIVE"))
                {
                        activeItemList.remove(i);
                        i--;
                }
        }
        context.put("activeItemList", activeItemList);
        return "success";
    }
    
}
