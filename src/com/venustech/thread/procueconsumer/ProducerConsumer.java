package com.venustech.thread.procueconsumer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java���߳�ģ������������������
 * 
 * ProducerConsumer�����࣬Producer�����ߣ�Consumer�����ߣ�Product��Ʒ��Storage�ֿ�
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Storage s = new Storage();
        ExecutorService service = Executors.newCachedThreadPool();
        Producer p = new Producer("����", s);
        Producer p2 = new Producer("����", s);
        Consumer c = new Consumer("����", s);
        Consumer c2 = new Consumer("����", s);
        Consumer c3 = new Consumer("����", s);
        service.submit(p);
        //service.submit(p2);
        service.submit(c);
        service.submit(c2);
        service.submit(c3);
    }
}