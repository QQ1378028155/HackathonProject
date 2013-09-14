<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>

                <table>
                        <th>商品标题</th>
                        <th>价格</th>
                        <th>状态</th>
                        <th>收费</th>
                        <tr>
                                <td align="center"><s:property value="#itemType.getTitle()"/></td>
                                <td align="center"><s:property value="#itemType.getSellingStatus().getCurrentPrice().getValue()"/>&nbsp<s:property value="#itemType.getSellingStatus().getCurrentPrice().getCurrencyID()"/></td>
                                <td align="center"><s:property value="#itemType.getSellingStatus().getListingStatus()"/></td>
                                <td><s:property value="#finalfee"/></td>>
                        </tr>
                </table>
                               
                        
</html>
