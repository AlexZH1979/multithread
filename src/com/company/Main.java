package com.company;

import com.company.conveer.Consumer;
import com.company.conveer.Conveer;
import com.company.conveer.Producer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List list1 = new CopyOnWriteArrayList();

        Conveer list = new Conveer();

        Runnable producer = new Producer(list);
        Runnable consumer = new Consumer(list);

        Thread pThread = new Thread(producer);
        Thread cThread = new Thread(consumer);

        pThread.start();
        cThread.start();
     }
}
