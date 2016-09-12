package com.venustech.thread.procueconsumer;
/**
 * 
 * ��˵��.������
 * <pre>
 * 2016��9��12�� songjian    
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
                Product product = new Product((int) (Math.random() * 10000)); // ����0~9999�������
                System.out.println(name + "׼������(" + product.toString() + ").");
                s.push(product);
                System.out.println(name + "������(" + product.toString() + ").");
                System.out.println("===============");
                Thread.sleep(500);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

    }

}
