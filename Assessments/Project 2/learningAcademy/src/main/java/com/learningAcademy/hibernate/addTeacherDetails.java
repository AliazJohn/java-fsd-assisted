package com.learningAcademy.hibernate;

import java.io.IOException;
//import java.io.PrintWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.dto.*;

/**
 * Servlet implementation class addTeacherDetails
 */
public class addTeacherDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTeacherDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		TeacherDetails teacher= new TeacherDetails(); 
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int subid = Integer.parseInt(request.getParameter("subjectid"));
		
		teacher.setTName(name);
		teacher.setAge(age);
		teacher.setSubID(subid);
		
		
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		out.print("<h3>successfully entered Teacher Details</h3>");
		 out.print("<a href=addTeacher.jsp>Go Back</>");
		
	}

}
