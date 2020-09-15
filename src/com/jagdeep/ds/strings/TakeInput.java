package com.jagdeep.ds.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        System.out.println("Enter the names");
        while(true){
            String name = input.nextLine();
            if(name.isEmpty())
                break;
            else
                System.out.println("Enter another name or blank name to exit.");
            result.add(name);
        }
        System.out.println("Entered names are");
        result.forEach(System.out::println);
    }
}
