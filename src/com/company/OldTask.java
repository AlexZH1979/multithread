package com.company;

/**
 * Created by USER on 25.01.2016.
 */
public class OldTask implements Runnable {
    private User user;

    public OldTask(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        System.out.println("22222222222");
        while (true) {
            try {
                Thread.sleep(1);

                int i = user.getBalance();
                user.setBalance(--i);
                //System.out.println("old: "+user.getBalance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
