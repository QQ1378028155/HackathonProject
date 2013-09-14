/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.TimeFilter;
import com.ebay.sdk.call.GetSellerListCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.PaginationType;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tongda
 */
public class HackList {

        public static List<ItemType> execute(String token) {
                ApiContext apiContext = new ApiContext();
                ApiCredential cred = apiContext.getApiCredential();
                cred.seteBayToken(token);
                apiContext.setApiServerUrl("https://api.sandbox.ebay.com/wsapi");
                GetSellerListCall api = new GetSellerListCall();
                api.setApiContext(apiContext);

                DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[]{
                        DetailLevelCodeType.RETURN_ALL,
                        DetailLevelCodeType.ITEM_RETURN_ATTRIBUTES,
                        DetailLevelCodeType.ITEM_RETURN_DESCRIPTION
                };


                int pageNum = 1;
                PaginationType pgn = new PaginationType();
                pgn.setEntriesPerPage(new Integer(200));
                pgn.setPageNumber(new Integer(pageNum++));
                api.setDetailLevel(detailLevels);
                api.setPagination(pgn);


                Calendar calendar1 = Calendar.getInstance();   //创建一个日历对象
                calendar1.setTimeInMillis(System.currentTimeMillis() - 3600 * 24 * 1000 * 5);
                Date date = new Date();

                Calendar calendar2 = Calendar.getInstance();   //创建一个日历对象
                calendar2.setTime(date);             //用当前时间初始化日历时间

                TimeFilter tf = new TimeFilter(calendar1, calendar2);
                //api.setEndTimeFilter(tf);
                api.setStartTimeFilter(tf);

                try {
                        ItemType[] itemType = api.getSellerList();
                        List<ItemType> itemList = new ArrayList();
                        for (int i = 0; i < itemType.length; i++) {
                            if(itemType[i].getTitle().length()>52)
                                itemType[i].setTitle(itemType[i].getTitle().substring(0, 50)+"...");
                            itemList.add(itemType[i]);
                        }
                        return itemList;
                } catch (ApiException ex) {
                        Logger.getLogger(HackList.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SdkException ex) {
                        Logger.getLogger(HackList.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                        Logger.getLogger(HackList.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
        }
}
