<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->

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
              
                <li><a href="message.jsp">Message</a></li>
                <li><a href="inventory.html">Inventory</a></li>
				 <li><a href="login.jsp">Sign out</a></li>
            </ul>
        </nav><!--END: menu-->
                 
    </div>
</header><!--END: header-->


<!--BEGIN: breadcrumbs -->
<div class="container breadcrumbs">
    <h1>Sell an item</h1>
   <!--END: breadcrumbs -->
</div>

<!--BEGIN: container-->
<section id="container">
    <div class="container">

        <!--BEGIN: side divider-->
        <div class="div-left"></div>
        <div class="div-right"></div>
        <!--END: side divider-->
      <ul class="nav nav-pills">
            <li><a href="listing-all.jsp">All Selling</a></li>
            <li class="active"><a href="listing-sell.html">Sell an item</a></li>
            <li><a href="sold.jsp">Sold</a></li>
          </ul>
        <!--BEGIN: top filtrable-->
        <bh /> 
        
        <div>
      <form class="form-horizontal" />
        <fieldset>
         <hr />
         <h2><i class=" icon-pencil"></i>Describe your item</h2>
          <br />
          <div class="control-group">
            <label class="control-label" for="input01">Title</label>
            <div class="controls">
             
         <input type="text" class="input-xlarge" id="input" />

            <i href="#" class="icon-question-sign" rel="popover" title="Title" data-content="This will be the title of your listing. State exactly what you're selling and include words that buyers might use to search, such as the item brand, color, size, and model number."></i>
             
            </div>
          </div>
          
           <div class="control-group">
            <label class="control-label" for="input01">Subtitle($0.50)</label>
            <div class="controls">
              <input type="text" class="input-xlarge" id="subtitle" />
                <input type="text" id="issubtitle" style="display:none;"/>
             <i href="#" class="icon-question-sign" rel="popover" title="Subtitle" data-content="Capture the interest of buyers when they view search results (in list view) by displaying more information below your title."></i>
             
            </div>
          </div>
          
        
          <div class="control-group">
            <label class="control-label" for="select01">Condition</label>
            <div class="controls">
              <select id="select01">
              	<option />-
                <option />New
                <option />New Other(see details)
                <option />Manufacturer refurbished
                <option />Seller refurbished
                <option />Used
                <option />For parts or not working
              </select>
             
               <p class="help-block"> <i class="icon-info-sign"></i>Stock photo is available only for items listed as new.</p>
            </div>
          </div>
       <div class="control-group">
            <label class="control-label" for="textarea">Condition description</label>
          
            <div class="controls">
              <textarea class="input-xlarge" id="textarea" rows="3"></textarea>  <i href="#" class="icon-question-sign" rel="popover" title="Condition Description" data-content="Tell buyers all about the condition of your item so they know exactly what to expect. Use this field only to describe your item's condition. You'll be able to add other details (such as your return policy) in other parts of your listing."></i>
              
              <p class="block"><i class="icon-info-sign"></i>Highlight any defects, missing parts, scratches or wear and tear also described in your item description. Use this field only for your item's condition to comply with our selling practices policy.</p>
            </div>
             
          </div>
          <hr />
           <h2><i class=" icon-pencil"></i>Add photos</h2>
            <br />
          <div class="control-group">
         
            <label class="control-label" for="fileInput">Picture</label>
            <div class="controls">
           <table class="table table-bordered">
           <tbody>
          <tr>
            <td>
            <img></img>
            <br />
            <p>
            <i class="icon-backward"></i>
            <i class="icon-forward"></i>
            <i class="icon-remove-sign" style="float:right;"></i>
            </p>
            </td>
          </tr>
        </tbody>
		</table><i href="#" class="icon-question-sign" rel="popover" title="Add Photos" data-content="	Including pictures of your item is vital to your success. You can upload them from your computer or specify URLs where they are hosted."></i>
        <!--BEGIN: agreesment-->
          <div id="Upload" class="modal hide fade" align="left">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h3>Add Photos</h3>
             
            </div>
            <div class="modal-body">
              <h4>Select photos for upload</h4>
              
<p><input class="input-file" id="fileInput" type="file" /></p>

            </div>
            <div class="modal-footer">
              <button href="#" class="button" data-dismiss="modal">Close</button>
              <button href="#" class="button">OK</button>
            </div>
            
          </div>
      
        <!--END: agreesment--> 
   
		  <a class="btn btn-small" data-toggle="modal" href="#Upload"><i class="icon-picture"></i>Add Photo</a>
            </div>
          </div>
          
          <hr />
           <h2><i class=" icon-pencil"></i>Describe your item</h2>
          <br />
          <div class="control-group">
            <label class="control-label" for="textarea">Description</label>
            <div class="controls">
              <textarea class="input-xlarge" id="textarea" rows="3"></textarea>
            </div>
          </div>
          
       
          
          
          <hr />
           <h2><i class=" icon-pencil"></i>Choose a format and price</h2>
          <br />
             <div class="control-group">
            <label class="control-label" for="appendedPrependedInput">Starting price</label>
            <div class="controls">
              <div class="input-prepend input-append">
                <span class="add-on">$</span><input class="span2" id="appendedPrependedInput" size="16" type="text" />
                <i href="#" class="icon-question-sign" rel="popover" title="Starting Price" data-content="		Set the price at which the bidding will begin. For example, a starting price of $9.99 means that the first bid must be at least $9.99."></i>
              </div>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="appendedPrependedInput">Buy It Now price</label>
            <div class="controls">
              <div class="input-prepend input-append">
                <span class="add-on">$</span><input class="span2" id="appendedPrependedInput" size="16" type="text" />
                <i href="#" class="icon-question-sign" rel="popover" title="Buy It Now Price" data-content="You can set a price at which a buyer can buy your item right away. This disappears after a bid is placed (or the reserve price is met)."></i>
              </div>
            </div>
          </div>
          
           <div class="control-group">
            <label class="control-label" for="input01">Quantity</label>
            <div class="controls">
             <input class="input-small disabled" id="disabledInput" type="text" placeholder="1" disabled="" />
         
             
            </div>
          </div>
           <div class="control-group">
            <label class="control-label" for="select01">Duration</label>
            <div class="controls">
              <select id="select01" class="input-small">
              	<option />-
                <option />1 days
                <option />3 days
                <option />5 days
                <option />7 days
                <option />10 days
              </select>    <i href="#" class="icon-question-sign" rel="popover" title="Duration" data-content="Select how long your listing will run. In general, a longer duration results in higher prices or increases the chances of a sale."></i>
            </div>
          </div>
          <hr />
          <h2><i class=" icon-pencil"></i>Add shipping details</h2>
          <br />
           <div class="control-group">
            <label class="control-label" for="appendedPrependedInput">Shipping Cost</label>
            <div class="controls">
              <div class="input-prepend input-append">
                <span class="add-on">$</span><input class="span2" id="appendedPrependedInput" size="16" type="text" />
                      <i href="#" class="icon-question-sign" rel="popover" title="Shipping Cost" data-content="Have the cost calculated automatically based on the buyer's location or charge the same cost to all buyers."></i>
              </div>
            </div>
          </div>
		
         <hr />
          <h2><i class=" icon-pencil"></i>Add other details</h2>
          <br />
           <div class="control-group">
            <label class="control-label" for="select01">Return policy </label>
            <div class="controls">
              <select onchange="cc(this[selectedIndex].value);" id="return" class="input-xlarge">
              	<option value="se1">Select One
                <option value="se2"/>Returns Accepted
                <option value="se3" />No returns Accepted
              </select>  <i href="#" class="icon-question-sign" rel="popover" title="Return Policy" data-content="Specify whether you accept returns and under what conditions."></i>
        
            </div>
          </div>
          
          <div>
          
            <div id="canreturn" style="display:none">
  		
          
            <div class="control-group">
<table class="table table-bordered span12">
<tbody>
<tr><td>
            <div class="controls"> 
            <p>After receiving the item, your buyer should start a return within:</p>
            
              <select id="returnday" class="input-small">
              	<option />14 Days
                <option />30 Days
                <option />60 Days
              </select>
            </div>

            <div class="controls"> 
            <p>Refund will be given as</p>
            
              <select id="returnday" class="input-xlarge">
              	<option />Money back
                <option />Money back or replacement(buyer's choice)
                <option />Money back or exchange(buyer's choice)
              </select>
            </div>
        
        
            <div class="controls"> 
            <p>Return shipping will be paid by</p>
            
              <select id="returnday" class="input-xlarge">
              	<option />Buyer
                <option />Seller
              </select>
            </div>
        
     
            <div class="controls">
            <p>Additional return policy details</p>
              <textarea class="input-xlarge" id="textarea" rows="3"></textarea> <p class="block"><i class="icon-info-sign"></i>5000 character limit</p>
            </div></td></tr></tbody>
            </table>
          </div>
          </div>  
           <div id="notreturn" style="display:none;">
  			<div class="control-group">
            <div class="controls">
             
<p>It is OK to not accept returns, but do remember that you are obligated to describe your item accurately.</p>
            </div>
          </div>
          </div>

         
    <hr />
<h4>Your fees so far: </h4>

          <div class="form-actions">
            <button type="submit" class="btn btn-primary">Continue</button>
            <button class="btn">Cancel</button>
          </div>
          
          
        </fieldset>
      </form>
      
      
      </div>
             
               
    </div>
</section><!-- END: container -->

<script type="text/javascript">
                var r = document.getElementById('canreturn');
                var nr = document.getElementById('notreturn');
			
                function cc(val) {
				if (val=="se1"){
					 r.style.display = "none";
                        nr.style.display = "none";
                       
				}
				if (val=="se2")
           { r.style.display = "block";
                        nr.style.display = "none";
                       
		   }
			if (val=="se3"){
                     r.style.display = "none";
                        nr.style.display = "block";   
		}
                }
               
</script>
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