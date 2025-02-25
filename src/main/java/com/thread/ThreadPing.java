package com.thread;

public class ThreadPing implements Runnable {

    DataTest d1;
    int count;

    public ThreadPing(DataTest a1, int count) {
        d1 = a1;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++)
            d1.ping(true);
        d1.ping(false);
    }
}
