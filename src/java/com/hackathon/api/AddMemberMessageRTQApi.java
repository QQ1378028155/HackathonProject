/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.call.AddMemberMessageRTQCall;
import com.ebay.soap.eBLBaseComponents.MemberMessageType;

/**
 *
 * @author WingFung
 */
public class AddMemberMessageRTQApi {
    
    static String apiSandboxServerUrl = "https://api.sandbox.ebay.com/wsapi";
    static String apiEbayServerUrl = "https://api.ebay.com/wsapi";
    
    public static void execute(String tokens, MemberMessageType mmt){
        try{
            ApiContext apiContext = new ApiContext();
            ApiCredential cred = apiContext.getApiCredential();
            cred.seteBayToken(tokens);
            apiContext.setApiServerUrl(apiSandboxServerUrl);
            AddMemberMessageRTQCall api = new AddMemberMessageRTQCall(apiContext);
            api.setMemberMessage(mmt);
            api.addMemberMessageRTQ();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
