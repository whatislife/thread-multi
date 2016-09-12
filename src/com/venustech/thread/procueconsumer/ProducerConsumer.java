package com.venustech.thread.procueconsumer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java多线程模拟生产者消费者问题
 * 
 * ProducerConsumer是主类，Producer生产者，Consumer消费者，Product产品，Storage仓库
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Storage s = new Storage();
        ExecutorService service = Executors.newCachedThreadPool();
        Producer p = new Producer("张三", s);
        Producer p2 = new Producer("李四", s);
        Consumer c = new Consumer("王五", s);
        Consumer c2 = new Consumer("老刘", s);
        Consumer c3 = new Consumer("老林", s);
        service.submit(p);
        //service.submit(p2);
        service.submit(c);
        service.submit(c2);
        service.submit(c3);
    }
}