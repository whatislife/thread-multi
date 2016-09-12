package com.venustech.thread;
/**
 * 
 * 类说明.产品
 * <pre>
 * 2016年9月12日 songjian    
 * </pre>
 */
public class Product {
	 private int id;

     public Product(int id) {
         this.id = id;
     }

     public String toString() {// 重写toString方法
         return "产品：" + this.id;
     }
}
