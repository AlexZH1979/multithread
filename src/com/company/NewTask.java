package com.company;

public class NewTask implements Runnable{
    private User user;

    public NewTask(User user){
        this.user = user;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);

                int i = user.getBalance();
                user.setBalance(++i);
                //System.out.println("new: "+user.getBalance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
