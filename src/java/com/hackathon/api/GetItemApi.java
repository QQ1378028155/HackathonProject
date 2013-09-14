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
import com.ebay.sdk.call.GetItemCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class GetItemApi {
    public static ItemType execute(String token,String itemID)
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
        
        GetItemCall gic = new GetItemCall();
        gic.setApiContext(apiContext);
        gic.setItemID(itemID);
        DetailLevelCodeType[] dlct = new DetailLevelCodeType[1];
        dlct[0] = DetailLevelCodeType.RETURN_ALL;
        gic.setDetailLevel(dlct);
        try {
            ItemType it = gic.getItem();
            return it;
        } catch (ApiException ex) {
            Logger.getLogger(GetItemApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(GetItemApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GetItemApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
