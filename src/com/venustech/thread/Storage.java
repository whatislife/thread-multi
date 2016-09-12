package com.venustech.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * 
 * 类说明.仓库，用来存放产品
 * <pre>
 * 2016年9月12日 songjian    
 * </pre>
 */
public class Storage {
    /**
     * 阻塞队列使用
     */
    BlockingQueue<Product> queues = new LinkedBlockingQueue<Product>(10);
    /**
     * 生产
     * 
     * @param p
     *            产品
     * @throws InterruptedException
     */
    public void push(Product p) throws InterruptedException {
        queues.put(p);
    }
    /**
     * 消费
     * 
     * @return 产品
     * @throws InterruptedException
     */
    public Product pop() throws InterruptedException {
        return queues.take();
    }


}
