<%-- 
    Document   : completeSaleForm
    Created on : Sep 14, 2013, 10:39:20 PM
    Author     : hackathon
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<img src="<s:property value="#itemType.getPictureDetails().getGalleryURL()"/>"/>
<form action="/HackathonProject/jsp/completeSale.action">
    <input type="hidden" name="itemID" value="<s:property value="itemID"/>"/>
    <input type="hidden" name="transactionID" value="<s:property value="transactionID"/>"/>
    <input type="hidden" name="userID" value="<s:property value="userID"/>"/>
    commentText:<input type="text" name="commentText"/>
    shippingID:<input type="text" name="shippingID"/>
    <input type="submit"/>
</form>