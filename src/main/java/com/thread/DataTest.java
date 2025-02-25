package com.thread;

public class DataTest {
    boolean pingCheck = true;

    public synchronized void ping(boolean flag) {
        try {
            while (pingCheck) {
                System.out.println("PING");
                pingCheck = false;
                notify();


            }
            if (flag)
                wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public synchronized void pong(boolean flag) {
        try {
            while (!pingCheck) {
                System.out.println("PONG");
                pingCheck = true;
                notify();


            }
            if (flag)
                wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
