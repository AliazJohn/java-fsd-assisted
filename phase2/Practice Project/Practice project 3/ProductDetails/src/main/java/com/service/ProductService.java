package com.service;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {
ProductDao ed = new ProductDao();
    
    public int storeEmployee(Product p) {
     if(p.getPrice()<=1000) {
      return 0;
     }else if(ed.storeEmployee(p)>0) {
            return 1;
        }else {
            return 0;
        }
    }
}