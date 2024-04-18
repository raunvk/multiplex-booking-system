package com.multiplex.business;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.multiplex.dao.DBUtility;
import com.multiplex.dao.UserRegistrationDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		response.getWriter().append("Served at: ").append(request.getContextPath());
    	UserRegistrationDao userd=new UserRegistrationDao();
    	userd.userRegistration(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	doGet(request, response);
    }

}
