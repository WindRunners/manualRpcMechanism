package com.zomake.thread;

/**
 * Created by RZ-CD on 2016/9/21.
 */
public class NewTreadImplementsRunnable implements Runnable {

    Thread t;

    NewTreadImplementsRunnable(Integer no) {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread" + no + " : " + t);
        t.start();
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                //暂停线程
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread.");
    }
}
