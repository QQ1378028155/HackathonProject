/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.call.GetMyMessagesCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.MyMessagesMessageType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author WingFung
 */
public class GetMyMessagesApi {
    
    static String apiSandboxServerUrl = "https://api.sandbox.ebay.com/wsapi";
    static String apiEbayServerUrl = "https://api.ebay.com/wsapi";
        
    public static List<MyMessagesMessageType> execute(String tokens){
             
        MyMessagesMessageType[] msgs, messages;
        String[] msgIDs;
        try{
            DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
                DetailLevelCodeType.RETURN_HEADERS,
                DetailLevelCodeType.RETURN_SUMMARY//,
                //DetailLevelCodeType.RETURN_MESSAGES
            };
            ApiContext apiContext = new ApiContext();
            ApiCredential cred = apiContext.getApiCredential();
            cred.seteBayToken(tokens);
            apiContext.setApiServerUrl(apiSandboxServerUrl);
            GetMyMessagesCall api = new GetMyMessagesCall(apiContext);
            api.setDetailLevel(detailLevels);
            api.getMyMessages();
            msgs = api.getReturnedMyMessages();
            msgIDs = new String[msgs.length];
            for (int i=0;i<msgs.length;i++){      
                msgIDs[i] = msgs[i].getMessageID();
            }
            detailLevels = new DetailLevelCodeType[] {
                DetailLevelCodeType.RETURN_HEADERS,
                DetailLevelCodeType.RETURN_SUMMARY,
                DetailLevelCodeType.RETURN_MESSAGES
            };
            api.setDetailLevel(detailLevels);
            api.setMessageIDs(msgIDs);
            api.getMyMessages();
            messages = api.getReturnedMyMessages();
            List<MyMessagesMessageType> myMessagesList = new ArrayList();
            myMessagesList.addAll(Arrays.asList(messages));

            return myMessagesList;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;        
    }
}
