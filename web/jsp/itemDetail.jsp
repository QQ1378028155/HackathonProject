<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
        <head>
                <title>Hackathon all Items</title>
        </head>
        <body>
                <table>
                        <th>商品标题</th>
                        <th>价格</th>
                        <th>状态</th>
                        <tr>
                                <td align="center"><s:property value="#item.getTitle()"/></td>
                                <td align="center"><s:property value="#item.getSellingStatus().getCurrentPrice().getValue()"/>&nbsp<s:property value="#item.getSellingStatus().getCurrentPrice().getCurrencyID()"/></td>
                                <td align="center"><s:property value="#item.getSellingStatus().getListingStatus()"/></td>
                        </tr>
                </table>
        </body>
</html>
