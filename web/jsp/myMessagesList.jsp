<%-- 
    Document   : myMessagesList
    Created on : 2013-9-14, 20:31:34
    Author     : WingFung
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>myMessagesList</title>
    </head>
    <body>
        <table border="1px">
            <tr>
                <th>Number</th>
                <th>MessageID</th>
		<th>Content</th>
                <th>MessageType</th>
                <th>ExternalMessageID</th>
                <th>ItemID</th>
                <th>ItemTitle</th>
                <th>RecipientUserID</th>
                <th>SendToName</th>
                <th>Sender</th>
                <th>Subject</th>
                <th>Text</th>
                <th>Respond</th>
            </tr>
            <s:iterator value="#mMsgList" status="u">
            <tr>
                <td align="center"><s:property value="#u.index+1"/></td>
                <td align='center'><s:property value="getMessageID()"/></td>
		<td align='center'><s:property value="getContent()"/></td>
                <td align='center'><s:property value="getMessageType()"/></td>
                <td align='center'><s:property value="getExternalMessageID()"/></td>
                <td align='center'><s:property value="getItemID()"/></td>
                <td align='center'><s:property value="getItemTitle()"/></td>
                <td align='center'><s:property value="getRecipientUserID()"/></td>
                <td align='center'><s:property value="getSendToName()"/></td>
                <td align='center'><s:property value="getSender()"/></td>
                <td align='center'><s:property value="getSubject()"/></td>
                <td align='center'><s:property value="getText()"/></td> 
                <td>
                    <form action="/HackathonProject/jsp/respondMessage.action" method="post">
                        <input type="text" name="responseContent"/>
                        <input type="hidden" name="emID" value="<s:property value="getExternalMessageID()"/>"/>
                        <input type="hidden" name="itemID" value="<s:property value="getItemID()"/>"/>
                        <input type="submit" value="respond" />
                    </form>
                    
                </td>
            </tr>
            </s:iterator>
        </table>
                <table border="1px">
            <tr>
                <th>Number</th>
                <th>MessageID</th>
		<th>Content</th>
                <th>MessageType</th>
                <th>ExternalMessageID</th>
                <th>ItemID</th>
                <th>ItemTitle</th>
                <th>RecipientUserID</th>
                <th>SendToName</th>
                <th>Sender</th>
                <th>Subject</th>
                <th>Text</th>
            </tr>
            <s:iterator value="#eMsgList" status="u">
            <tr>
                <td align="center"><s:property value="#u.index+1"/></td>
                <td align='center'><s:property value="getMessageID()"/></td>
		<td align='center'><s:property value="getContent()"/></td>
                <td align='center'><s:property value="getMessageType()"/></td>
                <td align='center'><s:property value="getExternalMessageID()"/></td>
                <td align='center'><s:property value="getItemID()"/></td>
                <td align='center'><s:property value="getItemTitle()"/></td>
                <td align='center'><s:property value="getRecipientUserID()"/></td>
                <td align='center'><s:property value="getSendToName()"/></td>
                <td align='center'><s:property value="getSender()"/></td>
                <td align='center'><s:property value="getSubject()"/></td>
                <td align='center'><s:property value="getText()"/></td> 
            </tr>
            </s:iterator>
        </table>
    </body>
</html>
