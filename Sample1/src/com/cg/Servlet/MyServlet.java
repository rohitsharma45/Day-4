package com.cg.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.obj")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String path=request.getServletPath();
		System.out.println(path);
		String target=null;
		
		switch(path)
		{
		case "/add.obj":
			target="empForm.html";
			break;
			
		case "/retrieve.obj":
			String name=request.getParameter("ename");
			String phone=request.getParameter("ephone");
			String email=request.getParameter("emailid");
			String dept=request.getParameter("edept");
			String design=request.getParameter("edesign");
			target="success.html";
			break;
	}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request,response);

	}
}
