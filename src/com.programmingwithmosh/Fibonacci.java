package com.programmingwithmosh;

import java.util.Scanner;

public class Fibonacci {
    public static final Scanner scan = new Scanner(System.in);

    public static int fib(int n) {
        int result = 0;
        if (n > 1){
            result += fib(n-1)+fib(n-2);
            return result;
        }else if(n == 1){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        System.out.println("The Fibonacci number is: "+ fib(n) );

    }
}
