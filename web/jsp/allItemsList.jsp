<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
        <head>
                <title>Hackathon all Items</title>
        </head>
        <body>
                <table>
                        <th>序号</th>
                        <th>商品标题</th>
                        <th>状态</th>
                        <th>操作</th>
                        <s:iterator value="#allItemList" status="u">
                                <tr>
                                        <td align="center"><s:property value="#u.index+1"/></td>
                                        <td align="center"><s:property value="getTitle()"/></td>
                                        <td align="center"><s:property value="getSellingStatus().getListingStatus()"/></td>
                                        <td align="center"><a href="showItem.action?itemID=<s:property value="getItemID()"/>">查看详情</a></td>
                                </tr>
                        </s:iterator>
                </table>
        </body>
</html>
