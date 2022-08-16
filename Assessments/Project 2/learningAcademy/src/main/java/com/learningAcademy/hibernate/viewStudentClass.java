package com.learningAcademy.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.dto.StudentDetails;
import com.learningAcademy.dto.ClassDetails;

/**
 * Servlet implementation class viewStudentClass
 */
public class viewStudentClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewStudentClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  session.beginTransaction();

		 List<?> list  = session.createQuery("FROM StudentDetails s, ClassDetails c WHERE s.StdId=c.ClassNum").list(); 
		 out.print("<h2>Students and Class Details</h2><br><br>");
		out.print("<table border=1");
		out.print("<tr><th>Student id</th><th>Roll Number</th><th>Student Name</th><th>Student Age</th><th>Class</th><th>Teacher Name</th></tr>");
			for(int i=0; i<list.size(); i++) {
				Object[] row = (Object[]) list.get(i);
				StudentDetails s = (StudentDetails)row[0];
				ClassDetails c= (ClassDetails)row[1];
				out.print("<tr><td>"+s.getStudentId()+"</td><td>"+s.getRollNo()+"</td><td>" +s.getStudentName()+"</td><td>" +s.getAge()+"</td><td>" +s.getStdId()+"</td><td>"+c.getAdvisorName()+"</td></tr>");
			}
			out.print("</table>");
			out.print("<br>");
			out.print("<a href='home.html'>Go Back</a>");}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
