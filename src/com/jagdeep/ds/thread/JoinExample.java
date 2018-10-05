package com.jagdeep.ds.thread;

public class JoinExample {

    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread2 extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] arg){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
