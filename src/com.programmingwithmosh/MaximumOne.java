package com.programmingwithmosh;

public class MaximumOne {
    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int temp =0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i] == 0){
                temp = 0;
            }else{
                temp++;
                if (temp > count){
                    count = temp;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
