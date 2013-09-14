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
import com.ebay.sdk.call.FetchTokenCall;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class FetchTokenApi {
    public static String execute(String sid)
    {
        ApiContext apiContext = new ApiContext();
        apiContext.setApiServerUrl(EbayApiSetting.serverUrl);
        ApiCredential cred = apiContext.getApiCredential();
        ApiAccount account = new ApiAccount();
        account.setApplication(EbayApiSetting.appID);
        account.setCertificate(EbayApiSetting.certID);
        account.setDeveloper(EbayApiSetting.devID);
        cred.setApiAccount(account);
        apiContext.setApiCredential(cred);
        FetchTokenCall ftc = new FetchTokenCall();
        ftc.setApiContext(apiContext);
        ftc.setSessionID(sid);
        try {
            String token = ftc.fetchToken();
            return token;
        } catch (ApiException ex) {
            Logger.getLogger(FetchTokenApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(FetchTokenApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FetchTokenApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
