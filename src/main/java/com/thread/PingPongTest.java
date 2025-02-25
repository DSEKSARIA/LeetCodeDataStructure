package com.thread;

public class PingPongTest {

    public static void main(String[] args) {
        DataTest d1 = new DataTest();
        int count = 2;
        Thread pong = new Thread(new ThreadPong(d1, count));
        Thread ping = new Thread(new ThreadPing(d1, count));
        ping.start();
        pong.start();

    }

}
