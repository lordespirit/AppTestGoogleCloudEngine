package com.poo.testapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class GetDataUser extends HttpServlet  {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      
		      // Set response content type
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();
		      String title = "Usando GET para obtener nombre y apellido";
		      String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		         
		      out.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		               "<h1 align = \"center\">" + title + "</h1>\n" +
		               "<h3 align = \"center\"> Recuerda enviar los datos mediante navegador ...registro?nombre=...&apellido=... </h1>\n" +
		               "<ul>\n" +
		                  "  <li><b>Nombre</b>: "
		                  + request.getParameter("nombre") + "\n" +
		                  "  <li><b>Apellido</b>: "
		                  + request.getParameter("apellido") + "\n" +
		               "</ul>\n" +
		            "</body>"
		            + "</html>"
		      );
		   }
	
}
