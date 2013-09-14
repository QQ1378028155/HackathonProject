/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.api;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.call.AddItemCall;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.CalculatedShippingRateType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.FeesType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingDurationCodeType;
import com.ebay.soap.eBLBaseComponents.ListingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.MeasureType;
import com.ebay.soap.eBLBaseComponents.PaymentDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wjl
 */
public class AddItem {

        public static String execute(ItemType itemType, String token) throws ApiException, SdkException, Exception {
                ApiContext apiContext = new ApiContext();
                ApiCredential cred = apiContext.getApiCredential();
                cred.seteBayToken(token);
                apiContext.setApiServerUrl("https://api.sandbox.ebay.com/wsapi");
                apiContext.setSite(itemType.getSite());
                AddItemCall api = new AddItemCall();
                api.setApiContext(apiContext);

//                ItemType newItem = new ItemType();
//                newItem.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
//                newItem.setTitle(itemType.getTitle());
//
//                newItem.setStartPrice(itemType.getSellingStatus().getConvertedCurrentPrice());
//                newItem.setAutoPay(false);
//                newItem.setPictureDetails(itemType.getPictureDetails());
//                newItem.setDescription(itemType.getDescription()+"");
//                newItem.setCurrency(itemType.getCurrency());
//                newItem.setCountry(itemType.getCountry());
//                newItem.setListingDuration(itemType.getListingDuration());
//                newItem.setLocation(itemType.getLocation());
//                newItem.setPrimaryCategory(itemType.getPrimaryCategory());
//                BuyerPaymentMethodCodeType[] bpmcts = new BuyerPaymentMethodCodeType[1];
//                bpmcts[0] = BuyerPaymentMethodCodeType.PAY_PAL;
//                newItem.setConditionID(itemType.getConditionID());
//                newItem.setConditionDefinition(itemType.getConditionDefinition());
//                newItem.setConditionDescription(itemType.getConditionDescription());
//                newItem.setConditionDisplayName(itemType.getConditionDisplayName());
//                
//                
//                newItem.setPaymentMethods(bpmcts);
//                newItem.setPayPalEmailAddress("1378028155@qq.com");
//                
//                newItem.setShippingDetails(itemType.getShippingDetails());
//                newItem.setDispatchTimeMax(10);
//                
//                api.setItem(newItem);
//                itemType.setDescription(itemType.getDescription()+"");
//                itemType.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
//                itemType.setStartPrice(itemType.getSellingStatus().getConvertedCurrentPrice());
////                itemType.setBuyItNowPrice(itemType.getSellingStatus().getConvertedCurrentPrice());
//                itemType.setPayPalEmailAddress("1378028155@qq.com");
//                itemType.setShippingPackageDetails(null);
//                
//                
//                api.setItem(itemType);

                ItemType newItem = new ItemType();
                newItem.setTitle(itemType.getTitle());
                newItem.setDescription(itemType.getDescription());
                newItem.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
                newItem.setStartPrice(itemType.getSellingStatus().getCurrentPrice());

                newItem.setPictureDetails(itemType.getPictureDetails());
                newItem.setListingDuration(ListingDurationCodeType.DAYS_3.value());


                newItem.setCurrency(itemType.getCurrency());
                newItem.setCountry(itemType.getCountry());
                newItem.setLocation(itemType.getLocation());
                newItem.setSite(itemType.getSite());
                newItem.setQuantity(itemType.getQuantity());

                newItem.setAutoPay(false);

                CategoryType ct = new CategoryType();
                ct.setCategoryID("171485");
                ct.setCategoryName("Computers/Tablets &amp; Networking:iPads, Tablets &amp; eBook Readers");

                newItem.setPrimaryCategory(ct);





                BuyerPaymentMethodCodeType[] bpmcts = new BuyerPaymentMethodCodeType[1];
                bpmcts[0] = BuyerPaymentMethodCodeType.PAY_PAL;
                newItem.setPaymentMethods(bpmcts);
                newItem.setConditionID(itemType.getConditionID());
                newItem.setPayPalEmailAddress("1378028155@qq.com");

//                ShippingDetailsType sdt = new ShippingDetailsType();
                  
                try
                {
                        ShippingTypeCodeType stct = itemType.getShippingDetails().getShippingType();
                        System.out.println("                                                                      " + stct.value());
                        if(stct.value().equals("Flat"))
                        {
                                MeasureType mt1 = itemType.getShippingDetails().getCalculatedShippingRate().getWeightMajor();
                                mt1.setValue(BigDecimal.ZERO);
                                MeasureType mt2 = itemType.getShippingDetails().getCalculatedShippingRate().getWeightMinor();
                                mt2.setValue(BigDecimal.ZERO);
                                
                        }
                }catch(Exception e)
                {
                        
                }
                
                
                
                newItem.setShippingDetails(itemType.getShippingDetails());
                newItem.setReturnPolicy(itemType.getReturnPolicy());
                newItem.setDispatchTimeMax(itemType.getDispatchTimeMax());
                newItem.setConditionID(1000);

                //newItem.getShippingDetails().setCODCost(null);


                api.setItem(newItem);

                api.setEndUserIP("59.78.38.83");

                FeesType fee = api.addItem();
                String finalfee = "";
                for(int i=0; i<fee.getFeeLength(); i++)
                {
                        if(fee.getFee(i).getFee().getValue() != 0)
                        finalfee += fee.getFee(i).getName() + ":" + fee.getFee(i).getFee().getCurrencyID().toString() + " " + fee.getFee(i).getFee().getValue() + "\r\n";
                }
                System.out.println(finalfee);
                return finalfee;
        }
}
