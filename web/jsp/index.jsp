<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Hackathon</title>
    </head>
    <body>
        <s:action name="ebaySellerLogin"></s:action>
        <form action="/HackathonProject/jsp/getToken.action">
            <input type="submit" value="Login"/>
        </form>
        <a href="showAllItems.action">显示所有商品</a>
        <a href="showActiveItems.action">显示Active商品</a>
        <a href="toAddItem.jsp">进入添加商品页面</a>
        <a href="showMyMessages.action">显示消息</a>
    </body>
</html>
