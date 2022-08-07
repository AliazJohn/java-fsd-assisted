package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Product;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  //response.getWriter().append("Served at: ").append(request.getContextPath());
  try {
   PrintWriter out = response.getWriter();
   int id = Integer.parseInt(request.getParameter("pid"));
   String name = request.getParameter("pname");
   int price = Integer.parseInt(request.getParameter("price"));
   Product pr = new Product();
   pr.setPid(id);
   pr.setPname(name);
   pr.setPrice(price);
   
   ProductService ps = new ProductService();
   int result = ps.storeEmployee(pr);
   if(result==0) {
    RequestDispatcher rd = request.getRequestDispatcher("index.html");
    rd.include(request, response);
    out.print("<center><span style='color:red'>Record didn't insert!!!<br>Provide Correct Details!</span</center>");
   }else {
   RequestDispatcher rd = request.getRequestDispatcher("index.html");
   rd.include(request, response);
   out.print("<center><span style='color:green'>Record inserted Succesfully!!!</span</center>"); 
   }
  } catch (Exception e) {
   // TODO: handle exception
   System.out.println(e);
  }
  
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}