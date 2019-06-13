package com.alexcaves.web;

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
    
    private String setUnknown(String input) {
    	if(input == null) {
    		input = "Unknown";
    	}
    	return input;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("name");
		String favLanguage = request.getParameter("language");
		String homeTown = request.getParameter("town");
		
		userName = setUnknown(userName);
		favLanguage = setUnknown(favLanguage);
		homeTown = setUnknown(homeTown);
		
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, "+userName+".</h1>");
		out.write("<h3>Your favorite language is: "+favLanguage+".</h3>");
		out.write("<h3>You're from: "+homeTown+".</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
