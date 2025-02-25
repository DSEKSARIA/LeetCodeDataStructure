package com.thread;

public class ThreadPong implements Runnable {
    DataTest d1;
    int count;

    public ThreadPong(DataTest a1, int count) {
        d1 = a1;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count - 1; i++)
            d1.pong(true);
        d1.pong(false);
    }
}
