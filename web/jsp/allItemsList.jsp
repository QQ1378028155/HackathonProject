<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



   <section class="row da-thumbs portfolio filtrable clearfix">
   <s:iterator value="#allItemList" status="u">
            <!--BEGIN: latest blog col 1 -->
            <article data-id="id-<s:property value="#u.index+1"/>" data-type="<s:property value="getSellingStatus().getListingStatus()"/>" class="span3">
                <span>
                    <img src="example/<s:property value="getSellingStatus().getListingStatus()"/>.jpg" alt="photo" />
                    <div class="pd">
                        <a href="example/view.jpg" class="p-view" data-rel="prettyPhoto"></a>
                        <a href="portfolio-single.html" class="p-link"></a>
                    </div>
                </span>
                   <a style="height:3px;" href="showItem.action?itemID=<s:property value="getItemID()"/>"> <s:property value="getTitle()"/></a>            
                <p><s:property value="getSellingStatus().getListingStatus()"/></p>
                <a href="showItem.action?itemID=<s:property value="getItemID()"/>" class="read-more">Read More ...</a>
            </article><!--END: latest blog col 1 -->
              </s:iterator>
        </section>           