/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.hackathon.api.BareBonesBrowserLaunch;
import com.hackathon.api.EbayApiSetting;
import com.hackathon.api.GetSessionIdApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author hackathon
 */
public class EbaySellerLoginAction extends ActionSupport {
    
    @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String sid = GetSessionIdApi.execute(EbayApiSetting.ruName);
        String authUrl = "https://signin.sandbox.ebay.com/ws/eBayISAPI.dll?SignIn&RuName=" + EbayApiSetting.ruName + "&SessID=" + sid;
        context.getSession().put("sid", sid);
        BareBonesBrowserLaunch.openURL(authUrl);
        
        return "success";
    }
    
}
