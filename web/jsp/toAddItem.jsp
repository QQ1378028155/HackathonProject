<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
        <head>
                <title>Hackathon all Items</title>
        </head>
        <body>
                <form action="/HackathonProject/jsp/addItem.action" method="post">
                        商品标题<input type="text" name="itemTitle"/>
                        商品描述<input type="text" name="itemDescription"/>
                        商品价格<input type="text" name="itemPrice"/>
                        商品图片地址<input type="text" name="itemPictureDetails" value="http://t2.baidu.com/it/u=2525769627,3649189304&fm=21&gp=0.jpg"/>
                        商品数量<input type="text" name="itemQuantity"/>
                        商品边框<input type="text" name="border"/>
                        商品标题加粗<input type="text" name="bold_title">
                        商品高亮<input type="text" name="highlight">
                        商品特点<input type="text" name="featured">
                        <input type="submit" value="添加商品"/>
                </form>
        </body>
</html>
