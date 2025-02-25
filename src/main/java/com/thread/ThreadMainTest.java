package com.thread;

import java.util.Scanner;

public class ThreadMainTest {
    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);
        System.out.println("GAME STARTED !!!");
        ThreadImpl t1 = new ThreadImpl("PING");
        ThreadImpl t2 = new ThreadImpl("PONG");
        //t1.setDaemon(true);
        t1.start();
        //t1.setDaemon(true);
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("GAME STOP !!!");
        //String user = sc.nextLine();
        //System.out.println("Hello " + user + "!!!");


    }
}
