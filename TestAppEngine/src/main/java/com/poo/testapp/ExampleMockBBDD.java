package com.poo.testapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Admin;
import model.DBAdmin;

@SuppressWarnings("serial")
public class ExampleMockBBDD extends HttpServlet {
	
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {

		 DBAdmin dbadmin = new DBAdmin();
		 ArrayList<Admin> list = new ArrayList<Admin>(dbadmin.findAllAdmin());

		 // Set response content type
		 response.setContentType("text/html");
		 
		 PrintWriter out = response.getWriter();
		 String title = "Ejemplo Mock BBDD";
		 String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		 out.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		            	"<h1 align = \"center\">" + title + "</h1>\n" +
		            	"<table bgcolor ='#FFF5EE' border='1' cellpadding='10' cellspacing='1' width='40%''>");
		 for(Admin admin: list)
			 	out.println("<tr><td>" + admin.getId() + "</td><td>" + admin.getName() + "</td></tr>");
		 	out.println("</table>" +
		           "</body>"
		      + "</html>"
		      );
		 	}
	 }
