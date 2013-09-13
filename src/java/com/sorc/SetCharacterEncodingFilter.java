package com.sorc; 

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

public class SetCharacterEncodingFilter extends HttpServlet implements Filter{ 
   private FilterConfig filterConfig; 
   private String encoding=null; 
   //Handle the passed-in FilterConfig 
   public void init(FilterConfig filterConfig){ 
      this.filterConfig=filterConfig; 
      encoding=filterConfig.getInitParameter("encoding"); 
   } 
   //Process the request/response pair 
   public void doFilter(ServletRequest request,ServletResponse response,FilterChain filterChain){ 
      try{ 
         request.setCharacterEncoding(encoding); 
         filterChain.doFilter(request,response); 
      } catch(ServletException sx){ 
         filterConfig.getServletContext().log(sx.getMessage()); 
      } catch(IOException iox){ 
         filterConfig.getServletContext().log(iox.getMessage()); 
      } 
   } 
   //Clean up resources 
   public void destroy(){ 
   } 
} 