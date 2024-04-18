package com.multiplex.dao;
//create table user(UserId int auto_increment primary key, UserName varchar(45), MobileNo BIGINT, EmailId varchar(255), Password varchar(45));
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.multiplex.business.*;

public class UserRegistrationDao {
	public void userRegistration(HttpServletRequest request, HttpServletResponse response) {
		try {
			boolean flag=false;
			Connection con= DBUtility.getConnection();
			PreparedStatement st = con.prepareStatement("insert into user values(?,?,?,?,?,?)");
			String userName1=request.getParameter("UserName");
			String userTypes=request.getParameter("UserType");
			char userType1=userTypes.charAt(0);
			long mobileNo1=Long.parseLong(request.getParameter("MobileNo"));
			String emailId1=request.getParameter("EmailId");
			String password1=request.getParameter("Password");
			String repassword1=request.getParameter("Repass");
			String queryString = "select EmailId from user ";
	        ResultSet results = st.executeQuery(queryString);
	        boolean flag1=false;
	        while (results.next()) {
		        String emailId2 = results.getString("EmailId");
		        if ((emailId1.equals(emailId2))) {
		              flag1 = true;  
		        } 
	        }
	        if(flag1) {
	        	JOptionPane.showMessageDialog(null, "EmailId already exists, Please register using another email");
				RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");  
	            rd.forward(request, response);
	        }else {
				if(password1.equals(repassword1)) {
					flag=true;
				}
				if(!flag) {
					JOptionPane.showMessageDialog(null, "Passwords didn't match ");
				}else {
					UserDetails user1=new UserDetails(userName1, userType1, mobileNo1, emailId1, password1);
					st.setInt(1, 0);
		            st.setString(2, user1.getUserName());
		            st.setString(3, String.valueOf(user1.getUserType()));
		            st.setLong(4, user1.getMobileNo());
		            st.setString(5, user1.getEmailId());
		            st.setString(6, user1.getPassword());
				}
	        }
            st.executeUpdate();
            st.close();
            con.close();
            PrintWriter out = response.getWriter();
            if(flag) {
            	RequestDispatcher rd=request.getRequestDispatcher("SignIn.jsp");  
	            rd.forward(request, response);
            }else {
            	out.println("<html><body><b>Registration Failed" + "</b></body></html>");
            }
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
}
