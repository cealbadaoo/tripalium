package com.webhomecover.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAgentServlet extends HttpServlet {

	private static final long serialVersionUID = -7383178002123053954L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Configuraci�n del tipo de contenido de la respuesta
		response.setContentType("text/html");
		
		//Obtenci�n de un objeto PrintWriter a partir del objeto de respuesta		
		PrintWriter out = response.getWriter();
		
		//Obtenci�n de la cabecera del agente del usuario a partir de la petici�n
		String userAgent = request.getHeader("User-Agent");
		
		
		//Escritura de la p�gina HTML
		out.println("<div>");
		
		//Esta l�nea contiene un contenido din�mico
		out.println("Your browser sent the following header: <strong>" + userAgent + "<strong>");
		out.println("</div>");
				
		//Cierre del flujo de salida
		out.close();
		
		}
	}