package com.learningAcademy.hibernate;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.dto.SubjectDetails;
import com.learningAcademy.dto.TeacherDetails;
/**
 * Servlet implementation class viewSubjectTeacher
 */
public class viewSubjectTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewSubjectTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  session.beginTransaction();

		 List<?> list  = session.createQuery("FROM SubjectDetails e, TeacherDetails t WHERE e.SubID=t.SubID").list(); 
		 out.print("<h2>Subject and Teachers Details</h2><br><br>");
		out.print("<table border=1");
		out.print("<tr><th>Teacher id</th><th>Teacher Name</th><th>Teacher Age</th><th>Subject id</th><th>Subject Name</th>");
			for(int i=0; i<list.size(); i++) {
				Object[] row = (Object[]) list.get(i);
				TeacherDetails t = (TeacherDetails)row[1];
				SubjectDetails s = (SubjectDetails)row[0];
				out.print("<tr><td>"+t.getTeacherID()+"</td><td>" +t.getTName()+"</td><td>" +t.getAge()+"</td><td>" +s.getSubID()+"</td><td>"+s.getSubjectName()+"</td></tr>");
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
