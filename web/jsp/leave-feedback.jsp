<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->

    <head>

        <!-- BEGIN: basic page needs -->
        
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
        <title>eGO - Leave a feedback</title>
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
                    <p><input type="text" name="search site" value="Search..." onfocus="if(this.value=='Search...') this.value=''" onblur="if(this.value=='') this.value='Search...'" /></p>
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
                        <li><a href="./sell-an-item.jsp">Sell an item</a></li>
                       <li class="last"><a href="./sold.jsp">Shipping</a></li>
                  </ul>
                  </li>
                </li>
              
                <li><a href="#">Message</a></li>
                <li><a href="#">Inventory</a></li>
				 <li><a href="#">Sign out</a></li>
            </ul>
        </nav><!--END: menu-->
                 
    </div>
</header><!--END: header-->


<!--BEGIN: breadcrumbs -->
<div class="container breadcrumbs">
    <h1>Leave a feedback</h1>
   <!--END: breadcrumbs -->
</div>

<!--BEGIN: container-->
<section id="container">
    <div class="container">

       <!--BEGIN: side divider-->
        <div class="div-left"></div>
        <div class="div-right"></div>
        <!--END: side divider-->
        
        <div class="row">
                    
            <section id="page-sidebar" class="alignrleft span9">

       
                
                <!--BEGIN: commetns form-->                      
                <form id="comment-form" method="post" />
                    <div class="row">
                    
                        <p class="span4">Rate this transaction: <input type="text" id="author" name="author"  class="disabled" placeholder="Positive" disabled="" /></p>
                        <div class="clear"></div>
                        
                      <p class="span4">Trading code: <input type="text" id="author" name="author"  class="required" />  </p>
                    
                        <p class="span9">Tell us more: <textarea id="text" name="text" rows="1" cols="1" class="required"></textarea></p>
                        <p class="span3"><input type="submit" name="submit" value="Leave Feedback" class="button" /></p>
                    </div>
                    <div id="progress" class="alert alert-success" style="display:none;">Loading...</div>
                 </form>
                <!--END: comments form-->


            </section>
    
            <!--BEGIN: sidebar left-->
            <aside id="sidebar" class="alignright span3">
            
                <!--BEGIN: blog categori-->
                <section>
                
                    <div class="title-divider">
                        <div class="divider-arrow"></div>                               
                        <h4>Product</h4>             
                    </div>
                    
                    <address>
                        <strong>Product Name</strong><br />
                        Price：<br />
                        item#：<br />
                       
                      </address>

                    <address>
                        <strong>Buyyer：</strong><br />
                        <a href="mailto:#">Unknown</a>
                    </address>
                        
                </section><!--END:blog categori -->
                
                
                <!--BEGIN: twitter -->
                <section id="twitter-sidebar">
                
                    <div class="title-divider">
                        <div class="divider-arrow"></div>                               
                        <h4>Twitter</h4>             
                    </div>
                    
                    <div class="twitter"></div> 
                    <script type="text/javascript">
                        $(document).ready(function(){
                           //TWITTER
                            $(".twitter").tweet({
                                  join_text: "auto",
                                  username: "envato",
                                  avatar_size:0,
                                  count: 3,
                                  auto_join_text_default: "we said,",
                                  auto_join_text_ed: "we",
                                  auto_join_text_ing: "we were",
                                  auto_join_text_reply: "we replied",
                                  auto_join_text_url: "we were checking out",
                                  loading_text: "loading tweets..."
                            });
                        });
                    </script>
                        
                </section><!--END: twitter -->
                
            </aside><!--END: sidebar left-->

        </div>
    
               
    </div>
</section><!-- END: container -->

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