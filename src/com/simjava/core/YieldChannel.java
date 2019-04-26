package com.simjava.core;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class YieldChannel {
    BlockingQueue<Event> channel = new LinkedBlockingQueue<Event>();

    public void In(Event e) throws InterruptedException {
        channel.put(e);
    }

    public Event Out() throws InterruptedException {
        return channel.take();
    }
}

//public class YieldChannel implements Generator<Event> {
//    private Class[] types = new Class[]{Event.class};
//
//    public YieldChannel(){}
//
//    @Override
//    public Event next(){
//        try {
//            // 利用反射生成 Person 对象
//            return (Event) types[0].newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//}

//import java.util.LinkedList;
//
//public class YieldChannel {
//    private LinkedList<Event> channel;
//    private final byte[] lock = new byte[1];
//
//    public YieldChannel(){
//        this.channel = new LinkedList<Event>();
//    }
//
//    public void In(Event e){
//        synchronized (lock){
//            channel.offer(e);
//        }
//    }
//
//    public Event Out(){
//        synchronized (lock){
//            return channel.poll();
//        }
//    }
//}