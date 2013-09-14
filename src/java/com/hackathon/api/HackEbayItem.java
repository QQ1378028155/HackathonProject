/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.call.GetItemCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HackEbayItem {

        public static ItemType execute(String itemEbayId, String token) {
                ApiContext apiContext = new ApiContext();
                ApiCredential cred = apiContext.getApiCredential();

                cred.seteBayToken(token);
                apiContext.setApiServerUrl("https://api.ebay.com/wsapi");

                GetItemCall api = new GetItemCall();
                api.setApiContext(apiContext);
                api.setItemID(itemEbayId);
                api.setIncludeCrossPromotion(true);
                api.setIncludeItemCompatibilityList(true);
                api.setIncludeItemSpecifics(true);
                api.setIncludeTaxTable(true);
                DetailLevelCodeType[] dlct = new DetailLevelCodeType[1];
                dlct[0] = DetailLevelCodeType.RETURN_ALL;
                api.setDetailLevel(dlct);
                api.setEndUserIP("59.78.38.83");
                try {
                        ItemType itemType = api.getItem();
                        return itemType;
                } catch (ApiException ex) {
                        Logger.getLogger(HackEbayItem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SdkException ex) {
                        Logger.getLogger(HackEbayItem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                        Logger.getLogger(HackEbayItem.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
        }
}
