package com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

//        System.out.println(args[0]);

        int a = 3;
        int b = 5;
        int result = a + b;
        System.out.println(" Sum of 3 and 5 equal " + result);


        double c = 8.5;
        double d = 5.3;
        double result1 = c - d;
        System.out.println(result1);

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = bufferedReader.readLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Your name is " + name);
        System.out.println("Your name is " + age);
        System.out.println("test");
        int hours =8;
        if (hours > 1){
            System.out.println("I worked: " + hours + " "+ "hour");
        } else {
            System.out.println("I worked: " + hours + " "+ "hours");
        }

        System.out.println("");
        int total = 0;
        int count = 2;
        if (count < 3 && total > -10)
        {
            System.out.println("It works");
        } else if (count > 3 || total ==0) {
            System.out.println(total * count);
        }

        System.out.println();




    }
}
