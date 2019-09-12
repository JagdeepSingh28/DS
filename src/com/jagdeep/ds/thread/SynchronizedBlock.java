package com.jagdeep.ds.thread;

public class SynchronizedBlock {

    static ComputeThread computeThread = new ComputeThread();
    static ComputeThread2 computeThread2 = new ComputeThread2();
    static Compute compute = new Compute();

    public static void main(String[] args) {
        computeThread.start();
        computeThread2.start();
    }

    static class ComputeThread extends Thread{

        @Override
        public void run() {
            compute.increment();
            System.out.println("Incre");
        }
    }

    static class ComputeThread2 extends Thread{

        @Override
        public void run() {
            System.out.println("getting"+compute.getValue());
        }
    }
}

class Compute{
    private int i = 0;

    public synchronized void increment(){
        i++;
//        System.out.println("Increment Done"+i);
    }

    public synchronized int getValue(){
//        System.out.println("Get Value Done"+i);
        return i;
    }
}
