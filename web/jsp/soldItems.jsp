<%-- 
    Document   : soldItems
    Created on : Sep 14, 2013, 6:35:20 PM
    Author     : hackathon
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hackathon</title>
    </head>
    <body>
        <table>
            <s:iterator value="#ttList" status="tt">
                <tr>
                    <td><s:property value="getItem().getTitle()"/></td>
                    <td><s:property value="getTransactionPrice().getValue()"/></td>
                    <td><s:property value="getTransactionPrice().getCurrencyID().value()"/></td>
                    <td><a href="/HackathonProject/jsp/transactionDetail.jsp?transactionID=<s:property value="getTransactionID()"/>&targetUser=<s:property value="getBuyer().getUserID()"/>&itemID=<s:property value="getItem().getItemID()"/>">操作</a></td>
                </tr>

            </s:iterator>
        </table>
    </body>
</html>
