/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.call.GetMemberMessagesCall;
import com.ebay.soap.eBLBaseComponents.MemberMessageExchangeType;
import com.ebay.soap.eBLBaseComponents.MessageTypeCodeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author WingFung
 */
public class GetMemberMessagesApi {
    static String apiSandboxServerUrl = "https://api.sandbox.ebay.com/wsapi";
    static String apiEbayServerUrl = "https://api.ebay.com/wsapi";
    
    public static List<MemberMessageExchangeType> execute(String tokens, String itemID){
        MemberMessageExchangeType[] msgs;
        List<MemberMessageExchangeType> messages = new ArrayList();
        try{
            ApiContext apiContext = new ApiContext();
            ApiCredential cred = apiContext.getApiCredential();
            cred.seteBayToken(tokens);
            apiContext.setApiServerUrl(apiSandboxServerUrl);
            GetMemberMessagesCall api = new GetMemberMessagesCall(apiContext);
            api.setItemID(itemID);
            api.setMailMessageType(MessageTypeCodeType.ALL);
            msgs = api.getMemberMessages();
            System.out.println("###### "+msgs.length);
            messages.addAll(Arrays.asList(msgs));
            return messages;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
