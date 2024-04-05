package com.programmingwithmosh;

public class pallindrome {
    public static void main(String[] args) {
        int x = 121;
        int num = x;
        int var = x;
        int count = -1;
        while(x>0){
            count++;
            x = x/10;
        }
        int newInt = 0;
        while(var>0){
            newInt = newInt + ((var%10) * (int)(Math.pow(10,(double)(count))));
            var = var/10;
            count --;
        }
        if(newInt == num){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
