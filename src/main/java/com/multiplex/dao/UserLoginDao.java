package com.multiplex.dao;

import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class UserLoginDao {
	public char userLogin(HttpServletRequest request, HttpServletResponse response) {
		char userType2=' ';
		try {
			boolean flag=false;
			Connection con= DBUtility.getConnection();
			Statement st = con.createStatement();
			String emailId1=request.getParameter("EmailId");
			String password1=request.getParameter("Password");
			String queryString = "select EmailId, Password, UserType from user ";
			
	        ResultSet results = st.executeQuery(queryString);
	        while (results.next()) {
		        String emailId2 = results.getString("EmailId");
		        String password2 =  results.getString("Password");
		        if ((emailId1.equals(emailId2)) && (password1.equals(password2))) {
		        	userType2=results.getString("UserType").charAt(0);
		              flag = true;  
		        } 
	        }
	        if(!flag){
	               JOptionPane.showMessageDialog(null, "Please Check Username and Password ");
	               RequestDispatcher rd=request.getRequestDispatcher("SignIn.jsp");  
	               rd.forward(request, response);
	        }
	        results.close();
            st.close();
            con.close();
            PrintWriter out = response.getWriter();
//            if(userType2=='U') {
//            	RequestDispatcher rd=request.getRequestDispatcher("QueryDetails.jsp");  
//	               rd.forward(request, response);
//            }else {
//            	out.println("<html><body><b>Login Failed" + "</b></body></html>");
//            }
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		 return userType2;
	}
}
