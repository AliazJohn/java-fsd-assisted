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

import com.learningAcademy.dto.ClassDetails;

/**
 * Servlet implementation class addClassDetails
 */
public class addClassDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addClassDetails() {
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
		ClassDetails c= new ClassDetails(); 
		int classnum=Integer.parseInt(request.getParameter("classnum"));
		int studentsnum=Integer.parseInt(request.getParameter("studentsnum"));
		String advisorname = request.getParameter("advisorname");

		
		c.setClassNum(classnum);
		c.setAdvisorName(advisorname);
		c.setStudCount(studentsnum);
		
		
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		 out.print("<h3>successfully entered class Details</h3>");
		 out.print("<a href=addClass.jsp>Go Back</>");
	}
		
	}


