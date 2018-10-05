package com.jagdeep.ds.thread;

public class MultipleOfThreeByThread {

    static int counter = 1;
    static Object lock = new Object();

    static class PrinterMethod implements Runnable {
        private int remainder;

        public PrinterMethod(int remainder) {
            this.remainder = remainder;
        }

        @Override
        public void run() {
            while (counter < 9) {
                synchronized (lock) {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " --> before while loop");
                    while (counter % 3 != remainder) {
                        System.out.println(threadName + " --> in While loop");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    String threadName1 = Thread.currentThread().getName();
                    System.out.println(threadName1 + " -->" + counter);
                    counter++;
                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] arg) {
        Thread t1 = new Thread(new PrinterMethod(1));
        Thread t2 = new Thread(new PrinterMethod(2));
        Thread t3 = new Thread(new PrinterMethod(0));

        t1.start();
        t2.start();
        t3.start();
    }
}
