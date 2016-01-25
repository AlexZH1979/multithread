package com.company.conveer;

import java.util.List;

/**
 * Created by USER on 25.01.2016.
 */
public class Consumer implements Runnable {
    private Conveer list;

    public Consumer(Conveer list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {

                System.out.println("consument getsize");
                if (list.getSize() > 0) {
                    System.out.println("consument after getsize");
                    int i = list.remove();
                    //System.out.println("Get: " + i);
                } else {
                    list.notify();
                    try {
                        System.out.println("Consumer wait");
                        list.wait(10000);
                        System.out.println("Consumer after wait");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
