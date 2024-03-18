package com.view.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.view.pojo.Database;

/**
 * Servlet implementation class serv1
 */
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password = request.getParameter("password");
		String action =request.getParameter("action");
		
		Database database_handler = new Database(name,password);

		
		if(action.equals("create")) {
			database_handler.createConnection();
			database_handler.insert();
			
			if(database_handler.isSuccess()==true) {
				response.sendRedirect("index.jsp");
			}
			else {
				System.out.println(database_handler.isSuccess());
				request.setAttribute("err", "User name Exist try another user");
				request.getRequestDispatcher("sign.jsp").forward(request, response);
			}
		}
		else if(action.equals("login")) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
