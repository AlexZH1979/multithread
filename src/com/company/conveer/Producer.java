package com.company.conveer;

import java.util.List;

/**
 * Created by USER on 25.01.2016.
 */
public class Producer implements Runnable {
    private Conveer list;

    public Producer(Conveer list){
        this.list = list;
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            synchronized (list) {

                System.out.println(" Producer  getSize");
                if (list.getSize() < 10) {
                    System.out.println(" Producer  after getSize");
                    ++i;
                    list.add(i);
                    //System.out.println("Add: "+i);

                } else {
                    list.notify();
                    try {
                        System.out.println(" Producer  wait");
                        list.wait(10000);
                        System.out.println(" Producer after wait");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
