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
import com.ebay.sdk.TimeFilter;
import com.ebay.sdk.call.GetSellerTransactionsCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.TransactionType;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class GetSellerTransactionsApi {
    
    public static TransactionType[] execute(String token) {
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
        
        GetSellerTransactionsCall gstc = new GetSellerTransactionsCall();
        gstc.setIncludeContainingOrder(true);
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(System.currentTimeMillis() - 15 * 3600 * 24 * 1000);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(System.currentTimeMillis());
        TimeFilter tf = new TimeFilter(c1,c2);
        gstc.setModifiedTimeFilter(tf);
        gstc.setApiContext(apiContext);
        DetailLevelCodeType[] dlct = new DetailLevelCodeType[1];
        dlct[0] = DetailLevelCodeType.RETURN_ALL;
        gstc.setDetailLevel(dlct);
        try {
            TransactionType[] tt = gstc.getSellerTransactions();
            
            return tt;
        } catch (ApiException ex) {
            Logger.getLogger(GetSellerTransactionsApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(GetSellerTransactionsApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GetSellerTransactionsApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
