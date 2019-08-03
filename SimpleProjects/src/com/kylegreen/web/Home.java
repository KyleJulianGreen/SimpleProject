package com.kylegreen.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String lang = request.getParameter("lang");
		String town = request.getParameter("town");
		// This grabs from the query parameters
		
		if(town == null) {
			town = "Unknown";
		}
		if(lang == null) {
			lang = "Unknown";
		}
		if(last == null) {
			last = "Unknown";
		}
		if(first == null) {
			first = "Unknown";
		}
		// If any of the queries are not inputed, it will replace null with
		// unknown
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + first + " " + last + "</h1>");
		out.write("<h3>Your favourite language is: " + lang + "</h3>");
		out.write("<h3>Your hometown is: " + town + "</h3>");
		// This is inputting the information onto the page
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
