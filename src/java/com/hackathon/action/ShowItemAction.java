/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.soap.eBLBaseComponents.ItemType;
import com.hackathon.api.HackItem;
import com.hackathon.api.HackList;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Tongda
 */
public class ShowItemAction extends ActionSupport{
        String itemID;
         @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String token = (String) context.getSession().get("token");
        ItemType item = HackItem.execute(itemID, token);

        context.put("item", item);
        return "success";
    }

        public String getItemID() {
                return itemID;
        }

        public void setItemID(String itemID) {
                this.itemID = itemID;
        }
    
}
