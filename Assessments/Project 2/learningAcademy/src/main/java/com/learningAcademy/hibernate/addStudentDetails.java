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
 * Servlet implementation class addStudentDetails
 */
public class addStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		StudentDetails student= new StudentDetails(); 
		String name = request.getParameter("name");
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		int age = Integer.parseInt(request.getParameter("age"));
		int std = Integer.parseInt(request.getParameter("std"));
		String address = request.getParameter("address");
		
		//student.setStudentId(0);
		student.setRollNo(rollno);
		student.setStudentName(name);
		student.setStdId(std);
		student.setAge(age);
		student.setAddress(address);
		
		
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		out.print("<h3>successfully entered Student Details</h3>");
		 out.print("<a href=addStudent.jsp>Go Back</>");
	
	}

}
