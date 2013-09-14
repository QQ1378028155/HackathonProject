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
import com.ebay.sdk.call.GetUserCall;
import com.ebay.soap.eBLBaseComponents.UserType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class GetUserApi {
    public static String execute(String token)
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
        
        GetUserCall guc = new GetUserCall();
        guc.setApiContext(apiContext);
        try {
            UserType ut = guc.getUser();
            return ut.getUserID();
        } catch (ApiException ex) {
            Logger.getLogger(GetUserApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(GetUserApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GetUserApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
