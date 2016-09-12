package com.venustech.thread;
/**
 * 
 * ��˵��.������
 * <pre>
 * 2016��9��12�� songjian    
 * </pre>
 */
public class Consumer implements Runnable {
    private String name;
    private Storage s = null;

    public Consumer(String name, Storage s) {
        this.name = name;
        this.s = s;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(name + "׼�����Ѳ�Ʒ.");
                Product product = s.pop();
                System.out.println(name + "������(" + product.toString() + ").");
                System.out.println("===============");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
