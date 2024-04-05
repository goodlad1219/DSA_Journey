package com.programmingwithmosh;

import java.util.Arrays;

public class Garage {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums = {2,5,6,2,2,3};
        int val = 2;
        int count=0;
        int[] temp = new int[nums.length];
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]!=val){
                temp[count]=nums[i];
                count++;
            }
        }
        nums = temp;

//        int m = 3, n = 3;
//        for(int i=0; i < n; i++){
//            nums1[m]=nums2[i];
//            m++;
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(nums));
    }
}
