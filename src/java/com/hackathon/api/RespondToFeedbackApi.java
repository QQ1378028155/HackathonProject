/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiAccount;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.call.RespondToFeedbackCall;
import com.ebay.soap.eBLBaseComponents.FeedbackResponseCodeType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class RespondToFeedbackApi {
    public static void execute(String token,String feedbackID,String userID,String itemID,String transactionID)
    {
        ApiContext apiContext = new ApiContext();
        apiContext.setApiServerUrl(EbayApiSetting.serverUrl);
        ApiCredential cred = apiContext.getApiCredential();
        ApiAccount account = new ApiAccount();
        account.setApplication(EbayApiSetting.appID);
        account.setCertificate(EbayApiSetting.certID);
        account.setDeveloper(EbayApiSetting.devID);
        cred.seteBayToken(token);
        cred.setApiAccount(account);
        apiContext.setApiCredential(cred);
        
        RespondToFeedbackCall rtfc = new RespondToFeedbackCall();
        rtfc.setApiContext(apiContext);
        rtfc.setFeedbackID(feedbackID);
        rtfc.setTransactionID(transactionID);
        rtfc.setResponseText("THANK FOR BUYING!!!!");
        rtfc.setResponseType(FeedbackResponseCodeType.REPLY);
        rtfc.setTargetUserID(userID);
        rtfc.setItemID(itemID);
        try {
            rtfc.respondToFeedback();
        } catch (ApiException ex) {
            Logger.getLogger(RespondToFeedbackApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(RespondToFeedbackApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RespondToFeedbackApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
