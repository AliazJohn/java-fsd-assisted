package com.learningAcademy.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.dto.loginDetails;

/**
 * Servlet implementation class loginpage
 */
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email=request.getParameter("email");
		String pswd=request.getParameter("pswd");
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  session.beginTransaction();
		  List li  = session.createQuery("FROM loginDetails").list(); 
		  Iterator it=li.iterator(); 
		  while(it.hasNext()){
		  Object o=(Object)it.next();
		   loginDetails l1=(loginDetails)o; 
		   if(l1.getEmail().equals(email) && l1.getPswd().equals(pswd)){
			   RequestDispatcher rd= request.getRequestDispatcher("home.html");
				 rd.forward(request, response);
		   }
		   else {
			   out.print("<h3>Incorrect Credentials</h3>");
				out.print("<a href=index.html>Go Back</>");
		   }
		 
		  }
	}

}
