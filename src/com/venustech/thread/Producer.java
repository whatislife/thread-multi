package com.venustech.thread;
/**
 * 
 * 类说明.生产者
 * <pre>
 * 2016年9月12日 songjian    
 * </pre>
 */
public class Producer implements Runnable {

    private String name;
    private Storage s = null;

    public Producer(String name, Storage s) {
        this.name = name;
        this.s = s;
    }

    public void run() {
        try {
            while (true) {
                Product product = new Product((int) (Math.random() * 10000)); // 产生0~9999随机整数
                System.out.println(name + "准备生产(" + product.toString() + ").");
                s.push(product);
                System.out.println(name + "已生产(" + product.toString() + ").");
                System.out.println("===============");
                Thread.sleep(500);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

    }

}
