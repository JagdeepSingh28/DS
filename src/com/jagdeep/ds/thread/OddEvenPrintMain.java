package com.jagdeep.ds.thread;

public class OddEvenPrintMain {
    static int counter = 0;
    static Object lock = new Object();
    static boolean isOdd = true;
    static class OddEvenNumberPrinterThread implements Runnable{
        @Override
        public void run() {
            while (counter<10){
                synchronized(lock){
                    counter++;
                    String tName = Thread.currentThread().getName();
                    System.out.println(tName + " --> "+ counter);
                    try {
                        if(isOdd) {
                            isOdd = !isOdd; //---------> 2
                            lock.wait();    //---------> 3
                            lock.notify();  //---------> 4
                        } else {
                            isOdd = !isOdd; //---------> 2
                            lock.notify();  //---------> 5
                            lock.wait();    //---------> 6
                        }
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }//synchronized block
            }//while loop
        }//run()
    }//OddEvenNumberPrinterThread class ends

    public static void main(String[] args){
        Thread t1 = new Thread(new OddEvenNumberPrinterThread());
        Thread t2 = new Thread(new OddEvenNumberPrinterThread());
        t1.start(); //------> 1
        t2.start(); //------> 1
    }
}