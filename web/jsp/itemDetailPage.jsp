<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
        <%@taglib prefix="s" uri="/struts-tags" %>
        <head>

                <!-- BEGIN: basic page needs -->

                <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
                <title>eGO - Seller Listings</title>
                <!-- END: basic page needs -->

                <!-- BEGIN: css -->
                <link href="css/bootstrap.css" type="text/css" rel="stylesheet" />
                <link href="css/style.css" type="text/css" rel="stylesheet" />
                <link href="css/bootstrap-responsive.css" type="text/css" rel="stylesheet" />
                <link href="css/responsive.css" type="text/css" rel="stylesheet" />
                <link href="css/prettyPhoto.css" type="text/css" rel="stylesheet" />
                <!-- END: css -->

                <!-- BEGIN: js -->
                <script type="text/javascript" src="js/jquery.min.js"></script>
                <script type="text/javascript" src="js/google-code-prettify/prettify.js"></script> 
                <script type="text/javascript" src="js/jquery.easing.1.3.js"></script> 
                <script type="text/javascript" src="js/bootstrap.js"></script> 
                <script type="text/javascript" src="js/superfish.js"></script> 
                <script type="text/javascript" src="js/hoverIntent.js"></script>  
                <script type="text/javascript" src="js/jquery.hoverdir.js"></script>
                <script type="text/javascript" src="js/jquery.flexslider.js"></script>  
                <script type="text/javascript" src="js/jflickrfeed.min.js"></script>
                <script type="text/javascript" src="js/jquery.prettyPhoto.js"></script> 
                <script type="text/javascript" src="js/jquery.quicksand.js"></script>
                <script type="text/javascript" src="js/jquery.elastislide.js"></script> 
                <script type="text/javascript" src="js/jquery.tweet.js"></script> 
                <script type="text/javascript" src="js/main.js"></script> 
                <!-- END: js -->  

                <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

        <body>


                <!--BEGIN: top line-->
                <section id="top-line">
                        <div class="container">
                                <div class="row">

                                        <div class="span6 hidden-phone">
                                                <ul class="top-menu">
                                                        <li><a href="#">Home</a></li>
                                                        <li><a href="#">Sitemap</a></li>
                                                        <li><a href="#" class="last">Contact</a></li>
                                                </ul>
                                        </div>

                                        <div class="span6">
                                                <ul class="top-social">

                                                        <li><a href="#" class="email last">Email</a></li>
                                                </ul>
                                        </div>

                                </div>
                        </div>
                </section><!--END: top line-->


                <!--BEGIN: header-->
                <header id="header">
                        <div class="container">

                                <!-- BEGIN: row -->
                                <div class="row">

                                        <!--BEGIN: logo-->
                                        <div class="span3 logo">
                                                <a href="#"><img src="images/logo.png" alt="logo" /></a>
                                        </div><!--END: logo-->

                                        <!--BEGIN: search&phone content-->
                                        <div class="span9 hidden-phone">

                                                <!--BEGIN: phone -->
                                                <span class="phone">Ebay Hacthon 2013, Shanghai, China</span>
                                                <!--END: phone--> 

                                                <div class="clear"></div>

                                                <!--BEGIN: search-->
                                                <form id="search" />
                                                <p><input type="text" name="search site" value="Search..." onfocus="if (this.value == 'Search...')
                                            this.value = ''" onblur="if (this.value == '')
                                            this.value = 'Search...'" /></p>
                                                <p><input type="submit" name="submit" value="" class="search-bt" /></p>
                                                </form><!--END search-->

                                        </div><!--END: search&phone -->

                                </div><!-- END: row -->

                                <!--BEGIN: menu-->        
                                <nav id="menu">
                                        <ul>

                                                <li><a href="./index.html">Home</a></li>
                                                <li><a href="./listing-all.jsp" class="current">Sell</a>
                                                        <ul>
                                                                <li><a href="./listing-all.jsp">All Sellings</a></li>
                                                                <li><a href="./sell-an-item.jsp">All Sell an item</a></li>
                                                                <li class="last"><a href="./sold.jsp">Sold</a></li>
                                                        </ul>
                                                </li>
                                                </li>
                                                <li><a href="message.jsp">Message</a></li>
                                                <li><a href="inventory.html">Inventory</a></li>
                                                <li><a href="login.jsp">Sign out</a></li>
                                        </ul>
                                </nav><!--END: menu-->

                        </div>
                </header><!--END: header-->


                <!--BEGIN: breadcrumbs -->
                <div class="container breadcrumbs">
                        <h1>All Selling</h1>

                </div><!--END: breadcrumbs -->


                <!--BEGIN: container-->

                <section id="container">
                        <div class="container">

                                <!--BEGIN: side divider-->
                                <div class="div-left"></div>
                                <div class="div-right"></div>
                                <!--END: side divider-->

                                <!--BEGIN: portfolio navigation -->
                                <div class="portfolio-nav">
                                        <ul>
                                                <li><a href="#" class="prev"></a></li>
                                                <li><a href="#" class="next"></a></li>
                                        </ul>
                                </div><!--END: portfolio navigation -->

                                <article class="portfolio-single row">

                                        <div class="span6">
                                                <img src="<s:property value="#item.getPictureDetails().getGalleryURL()"/>"></img>
                                        </div>

                                        <div class="span6">

                                                <h2><s:property value="#item.getTitle()"/></h2>

                                                <p>

                                                        <s:property value="#item.getSellingStatus().getCurrentPrice().getValue()"/>&nbsp<s:property value="#item.getSellingStatus().getCurrentPrice().getCurrencyID()"/>
                                                </p>

                                                <blockquote>
                                                        <p>
                                                                <s:property value="#item.getSellingStatus().getListingStatus()"/>
                                                        </p>
                                                        <p>
                                                                <s:property value="#item.getSellingStatus().getListingStatus()"/>
                                                        </p>
                                                        <hr />

                                                        <ul class="meta">
                                                                <li><strong>Date: </strong>  07 may 2012</li>
                                                                <li><strong>Client: </strong>  Designmd</li>
                                                                <li><strong>URL Project:</strong> <a href="#">www.website.com</a></li>
                                                        </ul>

                                        </div>

                                </article>

                                <!--BEGIN: divider arrow-->
                                <div class="title-divider">
                                        <div class="divider-arrow"></div>                                  
                                        <h3>Realted Work</h3>       
                                </div><!--END: divider arrow-->

                                <div class="row da-thumbs">

                                        <!--BEGIN: latest blog col 1 -->
                                        <article class="span3">
                                                <img src="example/latest1.jpg" alt="photo" />
                                                <div>
                                                        <a href="example/view.jpg" class="p-view"></a>
                                                        <a href="portfolio-single.html" class="p-link"></a>
                                                </div>
                                        </article><!--END: latest blog col 1 -->

                                        <!--BEGIN: latest blog col 2 -->
                                        <article class="span3">
                                                <img src="example/latest2.jpg" alt="photo" />
                                                <div>
                                                        <a href="example/view.jpg" class="p-view"></a>
                                                        <a href="portfolio-single.html" class="p-link"></a>
                                                </div>
                                        </article><!--END: latest blog col 2 -->

                                        <!--BEGIN: latest blog col 3 -->
                                        <article class="span3">
                                                <img src="example/latest3.jpg" alt="photo" />
                                                <div>
                                                        <a href="example/view.jpg" class="p-view"></a>
                                                        <a href="portfolio-single.html" class="p-link"></a>
                                                </div>
                                        </article><!--END: latest blog col 3 -->

                                        <!--BEGIN: latest blog col 4 -->
                                        <article class="span3">
                                                <img src="example/latest4.jpg" alt="photo" />
                                                <div>
                                                        <a href="example/view.jpg" class="p-view"></a>
                                                        <a href="portfolio-single.html" class="p-link"></a>
                                                </div>
                                        </article><!--END: latest blog col 4 -->

                                </div>


                        </div>    
                </section>





                <!-- END: container -->


                <!--BEGIN: sub nav-->
                <section id="footer-nav">
                        <div class="container">
                                <div class="row">

                                        <p class="span4">Ebay Hackthon</p>

                                        <div class="span8 hidden-phone">
                                                <ul>
                                                        <li><a href="./index.html">Home</a></li>
                                                </ul>
                                        </div>

                                </div>
                        </div>
                </section><!--END: sub nav-->
                <div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
        </body>
</html>