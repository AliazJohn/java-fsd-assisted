package com.learningAcademy.hibernate;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class viewStudentDetails
 */
public class viewStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  session.beginTransaction();
		  
		 List li  = session.createQuery("FROM StudentDetails").list(); 
		 request.setAttribute("clist", li); 
		  RequestDispatcher rd= request.getRequestDispatcher("viewStudent.jsp");
		 rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
