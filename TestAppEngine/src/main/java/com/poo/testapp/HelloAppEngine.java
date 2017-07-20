package com.poo.testapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloAppEngine extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
	  PrintWriter out = response.getWriter();
	  String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	  String title =  "Fecha Actual";
	  
    response.setContentType("text/html");
	out.println(docType +
       "<html>\n" +
          "<head><title>" + title  + "</title></head>\n" +
          "<body bgcolor = \"#f0f0f0\">\r\n" +
             "<h1> Bienvenido </h1>\r\n" +
             "<h2> + Primera App - Test v0.1 + </h2>\r\n" +
          "</body></html>"
    );

  }
}