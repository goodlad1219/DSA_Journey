package bosscoderclasswork;

public class p1040424 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for(int i =0; i< arr.length; i++){
            int temp1 = arr[i]+i;
            int temp2 = arr[i]-i;

            max1 = Math.max(max1, temp1);
            min1 = Math.min(min1, temp1);
            max2 = Math.max(max2, temp2);
            min2 = Math.min(min2, temp2);
        }
        System.out.println(Math.max((max1 - min1), (max2 - min2)));
    }
}
