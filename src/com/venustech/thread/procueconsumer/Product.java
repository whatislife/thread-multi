package com.venustech.thread.procueconsumer;
/**
 * 
 * ��˵��.��Ʒ
 * <pre>
 * 2016��9��12�� songjian    
 * </pre>
 */
public class Product {
	 private int id;

     public Product(int id) {
         this.id = id;
     }

     public String toString() {// ��дtoString����
         return "��Ʒ��" + this.id;
     }
}
