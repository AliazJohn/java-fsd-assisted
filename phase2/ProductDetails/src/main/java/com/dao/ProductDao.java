package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Product;

public class ProductDao {
 public int storeEmployee(Product p) {
  try {
  Configuration con = new Configuration();
  con.configure("hibernate.cfg.xml"); //load xml file
  SessionFactory sf = con.buildSessionFactory(); //connection con
  Session session = sf.openSession(); //statement or preparedstatement in jdbc
  Transaction tran = session.getTransaction();
  tran.begin();  
  session.save(p);   //same as insert query
  tran.commit();
  return 1;
  }catch (Exception e) {
   // TODO: handle exception
   System.out.println(e);
   return 0;
  }
 }

}