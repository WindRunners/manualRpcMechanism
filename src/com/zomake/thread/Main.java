package com.zomake.thread;

public class Main {

    public static void main(String[] args) {
//        testRunnable();
        testThread();
    }

    public static void testRunnable(){
        NewTreadImplementsRunnable n1 = new NewTreadImplementsRunnable(1);
        NewTreadImplementsRunnable n2 = new NewTreadImplementsRunnable(2);
        NewTreadImplementsRunnable n3 = new NewTreadImplementsRunnable(3);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main Thread exiting.");
    }

    public static void testThread(){
        new NewThreadExtendThread(); // 创建一个新线程
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
