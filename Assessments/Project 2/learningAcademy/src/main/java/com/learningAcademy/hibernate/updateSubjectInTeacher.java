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

import com.learningAcademy.dto.TeacherDetails;

/**
 * Servlet implementation class updateSubjectInTeacher
 */
public class updateSubjectInTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateSubjectInTeacher() {
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
		TeacherDetails c= new TeacherDetails(); 
		int teacherid=Integer.parseInt(request.getParameter("teacherid"));
		int subjectid=Integer.parseInt(request.getParameter("subjectid"));
		
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  c=(TeacherDetails) session.get(TeacherDetails.class, teacherid);
		  c.setTeacherID(c.getTeacherID());
		  c.setTName(c.getTName());
		c.setAge(c.getAge());
		c.setSubID(subjectid);
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
		out.print("<h3>successfully Assigned Subject to Teacher</h3>");
		out.print("<a href=updateSubject.jsp>Go Back</>");
	}

}
