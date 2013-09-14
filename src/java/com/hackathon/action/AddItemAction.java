/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.action;

import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingEnhancementsCodeType;
import com.ebay.soap.eBLBaseComponents.PictureDetailsType;
import com.ebay.soap.eBLBaseComponents.SellingStatusType;
import com.hackathon.api.AddItem;
import com.hackathon.api.HackEbayItem;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tongda
 */
public class AddItemAction extends ActionSupport {

        private String itemTitle;
        private String itemDescription;
        private Double itemPrice;
        private String itemPictureDetails;
        private Integer itemQuantity;
        private Integer border;
        private Integer bold_title;
        private Integer highlight;
        private Integer featured;

        @Override
        public String execute() throws ApiException, SdkException, Exception {
                ActionContext context = ActionContext.getContext();
                String token = (String) context.getSession().get("token");
                ItemType itemType = HackEbayItem.execute("171126512679", "AgAAAA**AQAAAA**aAAAAA**i/UAUg**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6AFmIahCZSFoQydj6x9nY+seQ**MO0BAA**AAMAAA**iB6H4TJa1uM0xuHFsR7/fIPSY0+Cnls7zz7hRr/bPwgF/zFzN1cRNVKyfrI3/67+vfkbrCHHrppGySUixAMt2UNeKWpwL85CSU7oj5nWbMH9u13qg5d9oiue1TDVdkYNRvcZK8xkbRyq+ldm38/Ha5e7FwlK8WWHxz0Qrz8y7ot/+TOE5Uz5vE4GueTwC8Li70dpV0zUzoFuXHeN1OLj2B4pSfFzSftfVdX0GLxcpMLYbeXBFP/NhC+XimzR+RvgHI/sUIEkSFCTpZEC/Yftqn6P57nKJKz7pX5aH3YT7Nqam/B5tbkMTsiLtMDU57eApWPoKsonlZBKvYrs9w+MzhWMB1aR9tW+Zn9h8FE1VUXSsfVFeYJU5/Xg93qyVG+TiMKaPviOneQ599A5nAA9BXN0+8k/K13alS5Cb+tqz5SEiDbr8yxNM1HUSDJQxlayUZ0Btg7TF7z6sprLGIJNF184B0HmH/QMuYT/kseOnK78WTpOH0C6qwm3wtWBc/lIfVjfzb3fpvcEWyhVBl4Dzvn91KtbrkP6ZdWCu2F20sudr4yzKJitILBMcDo9tnrbPgdQ3FYqrRiDljwbg1OzDZqPCT+/o1GHZNxkGo2tm37ofmSAuyT5ALy6yqUZgcHdeirO43OhEL1SOEC97m6GysQbVhCeHA1JJ26hW54fDT6gB8+t8XTmTyLlow+VFAO8tOskYdM36E/qQOmlvxlnPaDLQJpKadz3mevdgxY7CZ9gbPP5sjlxQoFtHNms+YBL");

                itemType.setTitle(itemTitle);
                itemType.setDescription(itemDescription);
                PictureDetailsType pdt = new PictureDetailsType();
                pdt.setGalleryURL(itemPictureDetails);
                itemType.setPictureDetails(null);
                AmountType at = new AmountType();
                at.setValue(itemPrice);
                at.setCurrencyID(CurrencyCodeType.USD);
                SellingStatusType sst = new SellingStatusType();
                sst.setCurrentPrice(at);
                itemType.setSellingStatus(sst);

                itemType.setQuantity(itemQuantity);
//home basic custo pro value

                List<ListingEnhancementsCodeType> lectlist = new ArrayList();
                int enhancesize = border + bold_title + highlight + featured;
                if (border == 1) {
                        lectlist.add(ListingEnhancementsCodeType.BORDER);
                }
                if (bold_title == 1) {
                        lectlist.add(ListingEnhancementsCodeType.BOLD_TITLE);
                }
                if (highlight == 1) {
                        lectlist.add(ListingEnhancementsCodeType.HIGHLIGHT);
                }
                if (featured == 1) {
                        lectlist.add(ListingEnhancementsCodeType.FEATURED);
                }

                ListingEnhancementsCodeType[] lects = new ListingEnhancementsCodeType[enhancesize];
                for (int i = 0; i < lectlist.size(); i++) {
                        lects[i] = lectlist.get(i);
                }

                itemType.setListingEnhancement(lects);
                String finalfee = AddItem.execute(itemType, token);
                context.put("finalfee", finalfee);
                context.put("itemType",itemType);
                System.out.println("*********************"+finalfee);
                return "success";
        }

        public String getItemTitle() {
                return itemTitle;
        }

        public void setItemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
        }

        public String getItemDescription() {
                return itemDescription;
        }

        public void setItemDescription(String itemDescription) {
                this.itemDescription = itemDescription;
        }

        public Double getItemPrice() {
                return itemPrice;
        }

        public void setItemPrice(Double itemStartPrice) {
                this.itemPrice = itemStartPrice;
        }

        public String getItemPictureDetails() {
                return itemPictureDetails;
        }

        public void setItemPictureDetails(String itemPictureDetails) {
                this.itemPictureDetails = itemPictureDetails;
        }

        public Integer getItemQuantity() {
                return itemQuantity;
        }

        public void setItemQuantity(Integer itemQuantity) {
                this.itemQuantity = itemQuantity;
        }

        public Integer getBorder() {
                return border;
        }

        public void setBorder(Integer border) {
                this.border = border;
        }

        public Integer getBold_title() {
                return bold_title;
        }

        public void setBold_title(Integer bold_title) {
                this.bold_title = bold_title;
        }

        public Integer getHighlight() {
                return highlight;
        }

        public void setHighlight(Integer highlight) {
                this.highlight = highlight;
        }

        public Integer getFeatured() {
                return featured;
        }

        public void setFeatured(Integer featured) {
                this.featured = featured;
        }
}
