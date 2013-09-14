/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.hackathon.api.FetchTokenApi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author hackathon
 */
public class getTokenAction extends ActionSupport{
    @Override
    public String execute()
    {
        ActionContext context = ActionContext.getContext();
        String sid = (String) context.getSession().get("sid");
        String token = FetchTokenApi.execute(sid);
        context.getSession().put("token",token);
        return null;
    }
}
