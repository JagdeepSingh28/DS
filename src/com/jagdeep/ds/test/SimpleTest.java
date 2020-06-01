package com.jagdeep.ds.test;

public class SimpleTest extends SuperClass {

    public static void main(String[] args) {
        SuperClass sClasss = new SuperClass();
        SuperClass simpleTest = new SuperClass(){
//            static int a = 10;  // Inner Class cant have anything static
            static final int b = 20; // Only static with final is allowed
            int a = 10;
            @Override
            void methosOne() {
                System.out.println("In Simple Test" + a);
            }
        };

        sClasss.methosOne();
        simpleTest.methosOne();
    }
}
