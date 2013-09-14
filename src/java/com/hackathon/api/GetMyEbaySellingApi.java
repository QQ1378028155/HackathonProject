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
import com.ebay.sdk.call.GetMyeBaySellingCall;
import com.ebay.soap.eBLBaseComponents.ItemListCustomizationType;
import com.ebay.soap.eBLBaseComponents.OrderTransactionType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class GetMyEbaySellingApi {
    public static OrderTransactionType[] execute(String token)
    {
        ApiContext apiContext = new ApiContext();
        apiContext.setApiServerUrl(EbayApiSetting.serverUrl);
        ApiCredential cred = apiContext.getApiCredential();
        ApiAccount account = new ApiAccount();
        cred.seteBayToken(token);
        cred.setApiAccount(account);
        apiContext.setApiCredential(cred);
        
        GetMyeBaySellingCall gmsa = new GetMyeBaySellingCall();
        gmsa.setApiContext(apiContext);
        ItemListCustomizationType soldList = new ItemListCustomizationType();
        soldList.setInclude(true);
        soldList.setDurationInDays(60);
        
        gmsa.setSoldList(soldList);
        try {
            gmsa.getMyeBaySelling();
            return gmsa.getReturnedSoldList().getOrderTransactionArray().getOrderTransaction();
        } catch (ApiException ex) {
            Logger.getLogger(GetMyEbaySellingApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(GetMyEbaySellingApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GetMyEbaySellingApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
