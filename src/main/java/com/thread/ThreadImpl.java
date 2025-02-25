package com.thread;

public class ThreadImpl extends Thread {

    public ThreadImpl(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 11; i++) {
                Thread.sleep(10+i);
                System.out.println("Thread " + getName() + " I = " + i);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time is UP !!!");

        System.exit(0);
    }
}
