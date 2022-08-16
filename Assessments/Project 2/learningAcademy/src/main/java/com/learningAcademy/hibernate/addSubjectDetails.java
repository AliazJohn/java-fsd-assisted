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

import com.learningAcademy.dto.SubjectDetails;

/**
 * Servlet implementation class addSubjectDetails
 */
public class addSubjectDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addSubjectDetails() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		SubjectDetails subject= new SubjectDetails(); 
		String subname = request.getParameter("subjectname");

		
		subject.setSubjectName(subname);
		
		
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		session.beginTransaction();
		session.save(subject);
		session.getTransaction().commit();
		out.print("<h3>successfully entered Subject Details</h3>");
		 out.print("<a href=addSubject.jsp>Go Back</>");
	}

}
