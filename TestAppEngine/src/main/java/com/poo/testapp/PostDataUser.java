package com.poo.testapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PostDataUser extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	      String title = "Bienvenido";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      String name = req.getParameter("first_name"); 
	      String surname = req.getParameter("last_name");
	      String edad  = req.getParameter("edad");
	      String dni = req.getParameter("dni");
	      String fullName = name + " " + surname; 
	      String sexo  = req.getParameter("gender");
	      String greeting;
	      String email = req.getParameter("email");
	      
	      if(sexo.equals("male")){
	    	  greeting = "Señor";
	      }else{
	    	  greeting = "Señora";
	      }
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	            	
	               "<h1 align = \"center\"> Bienvenido "+ greeting +" " + fullName  + "</h1>\n" +
	               "<h3>Edad: " + edad + " </h3>" +
	               "<h3> DNI : "+ dni +" </h3>\n" +
	               "<h3> Email : "+ email +" </h3>\n" +
	            "</body> </html>"
	      );
		
		
	}
}
