package com.boraji.tutorial.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author imssbora , this code is modified by srikanth for child branch
   I am writing something related to child branch
  
 */ 
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
/*
Srikanth has fixed the issue */
		 send.sendRedirect("/login");
			 
      resp.setContentType("text/plain");
      resp.getWriter().write("Hello World! Maven Web Project Example. new version");
   }
}
