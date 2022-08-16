package com.learningAcademy.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.dto.StudentDetails;

/**
 * Servlet implementation class updateClassInStudent
 */
public class updateClassInStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateClassInStudent() {
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
		StudentDetails c= new StudentDetails(); 
		int stdid=Integer.parseInt(request.getParameter("stdid"));
		int std=Integer.parseInt(request.getParameter("std"));
		String name = request.getParameter("name");

		//ClassDetails c1= new ClassDetails();
		
		
		

		
		
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  c=(StudentDetails) session.get(StudentDetails.class, stdid);
		  c.setStudentId(stdid);
		  c.setStudentName(name);
		  c.setRollNo(c.getRollNo());
		  c.setAge(c.getAge());
		  c.setStdId(std);
		  c.setAddress(c.getAddress());
		  
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
		out.print("<h3>successfully Assigned Class to Student</h3>");
		out.print("<a href=updateStudent.jsp>Go Back</>");
		
	}

}
