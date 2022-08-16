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

import com.learningAcademy.dto.ClassDetails;
import com.learningAcademy.dto.TeacherDetails;

/**
 * Servlet implementation class viewTeacherClass
 */
public class viewTeacherClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewTeacherClass() {
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

		 List<?> list  = session.createQuery("FROM TeacherDetails t, ClassDetails c WHERE t.TName=c.AdvisorName").list(); 
		 out.print("<h2>Teachers and Class Details</h2><br><br>");
		 //List<?> list = session.createQuery(hql).list();
		out.print("<table border=1");
		out.print("<tr><th>Teacher id</th><th>Teacher Name</th><th>Class</th><th>Number of Students</th></tr>");
			for(int i=0; i<list.size(); i++) {
				Object[] row = (Object[]) list.get(i);
				TeacherDetails t = (TeacherDetails)row[0];
				ClassDetails c= (ClassDetails)row[1];
				out.print("<tr><td>"+t.getTeacherID()+"</td><td>"+t.getTName()+"</td><td>" +c.getClassNum()+"</td><td>" +c.getStudCount()+"</td></tr>");
			}
			out.print("</table>");
			out.print("<br>");
			out.print("<a href='home.html'>Go Back</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
