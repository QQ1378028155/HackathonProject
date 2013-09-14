<%-- 
    Document   : transactionDetail
    Created on : Sep 14, 2013, 10:15:43 PM
    Author     : hackathon
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hackathon</title>
    </head>
    <body>
        <s:action name="getCompleteSaleForm" executeResult="true">
            <s:param name="itemID"><s:property value="#parameters.itemID"/></s:param>
            <s:param name="userID"><s:property value="#parameters.targetUser"/></s:param>
            <s:param name="transactionID"><s:property value="#parameters.transactionID"/></s:param>
        </s:action>
    </body>
</html>
