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
import com.ebay.sdk.call.CompleteSaleCall;
import com.ebay.soap.eBLBaseComponents.CommentTypeCodeType;
import com.ebay.soap.eBLBaseComponents.FeedbackInfoType;
import com.ebay.soap.eBLBaseComponents.ShipmentTrackingDetailsType;
import com.ebay.soap.eBLBaseComponents.ShipmentType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class CompleteSaleApi {

    public static void execute(String token, String transactionID, String commentText, String commentType, String targetUser, String itemID,String trackNumber) {
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
        
        CompleteSaleCall csc = new CompleteSaleCall();
        csc.setApiContext(apiContext);
        csc.setTransactionID(transactionID);
        csc.setPaid(true);
        csc.setShipped(true);
        FeedbackInfoType fit = new FeedbackInfoType();
        fit.setCommentText(commentText);
        fit.setCommentType(CommentTypeCodeType.fromValue(commentType));
        fit.setTargetUser(targetUser);
        csc.setFeedbackInfo(fit);
        csc.setItemID(itemID);
        
        ShipmentType st = new ShipmentType();
        ShipmentTrackingDetailsType[] stdt = new ShipmentTrackingDetailsType[1];
        stdt[0] = new ShipmentTrackingDetailsType();
        stdt[0].setShipmentTrackingNumber(trackNumber);
        stdt[0].setShippingCarrierUsed("UPS");
        st.setShipmentTrackingDetails(stdt);
        csc.setShipment(st);
        
        
        try {
            csc.completeSale();
        } catch (ApiException ex) {
            Logger.getLogger(CompleteSaleApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(CompleteSaleApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CompleteSaleApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
