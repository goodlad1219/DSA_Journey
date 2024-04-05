package com.programmingwithmosh;

import java.text.NumberFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Example of array

        System.out.println("Hello World");
        int[] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 33;
        System.out.println(Arrays.toString(numbers) );

        // Example of multidimensional array

        int[][] multid = new int[2][3];
        multid[0][0] = 2;
        System.out.println(Arrays.deepToString(multid));

        // casting String to number
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);

        // formatting number
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(2300);
        System.out.println(result);

        // method chaining

        String output = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(output);


    }
}
