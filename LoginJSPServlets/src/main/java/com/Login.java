package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		if(uname.equals("root") && pass.equals("root"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("username", uname);
			resp.sendRedirect("output2.jsp");
		}else {
			req.setAttribute("msg", "incorrect user_name or password");
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
			
			
			
		}
	
	
	}
}