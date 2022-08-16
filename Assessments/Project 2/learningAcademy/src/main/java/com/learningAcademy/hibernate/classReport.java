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
import com.learningAcademy.dto.StudentDetails;

/**
 * Servlet implementation class classsReport
 */
public class classReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public classReport() {
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
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		int classnum=Integer.parseInt(request.getParameter("classnum"));
		Configuration con = new Configuration();
		  con.configure("hibernate.cfg.xml"); //load xml file
		  SessionFactory sf = con.buildSessionFactory(); //connection con
		  Session session = sf.openSession(); //statement or preparedstatement in jdbc
		  session.beginTransaction();

		 List<?> list  = session.createQuery("FROM StudentDetails s, ClassDetails c WHERE c.ClassNum="+classnum +"AND s.StdId="+classnum).list(); 
		 //List<?> list = session.createQuery(hql).list();
		 out.print("<h2>Class Report of Standard "+classnum+"</h2><br><br>");
		out.print("<table border=1");
		out.print("<tr><th>Class id</th><th>Roll Number</th><th>Student Name</th><th>Student Age</th><th>Teacher Name</th></tr>");
			for(int i=0; i<list.size(); i++) {
				Object[] row = (Object[]) list.get(i);
				StudentDetails s = (StudentDetails)row[0];
				ClassDetails c= (ClassDetails)row[1];
				out.print("<tr><td>"+s.getStdId()+"</td><td>"+s.getRollNo()+"</td><td>" +s.getStudentName()+"</td><td>" +s.getAge()+"</td><td>"+c.getAdvisorName()+"</td></tr>");
			}
			out.print("</table>");
			out.print("<br>");
			out.print("<a href='report.jsp'>Go Back</a>");
	}

}
