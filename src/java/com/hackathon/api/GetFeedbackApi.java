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
import com.ebay.sdk.call.GetFeedbackCall;
import com.ebay.soap.eBLBaseComponents.CommentTypeCodeType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.FeedbackDetailType;
import com.ebay.soap.eBLBaseComponents.FeedbackTypeCodeType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hackathon
 */
public class GetFeedbackApi {
    public static FeedbackDetailType[] execute(String token,String userID)
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
        
        GetFeedbackCall gfc = new GetFeedbackCall();
        gfc.setApiContext(apiContext);
        gfc.setFeedbackType(FeedbackTypeCodeType.FEEDBACK_RECEIVED_AS_SELLER);
        gfc.setUserID(userID);
        DetailLevelCodeType[] dlct = new DetailLevelCodeType[1];
        dlct[0] = DetailLevelCodeType.RETURN_ALL;
        gfc.setDetailLevel(dlct);
        CommentTypeCodeType[] ctct = new CommentTypeCodeType[1];
        ctct[0] = CommentTypeCodeType.POSITIVE;
        gfc.setCommentType(ctct);
        try {
            FeedbackDetailType[] fbdt = gfc.getFeedback();
            return fbdt;
        } catch (ApiException ex) {
            Logger.getLogger(GetFeedbackApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SdkException ex) {
            Logger.getLogger(GetFeedbackApi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GetFeedbackApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
