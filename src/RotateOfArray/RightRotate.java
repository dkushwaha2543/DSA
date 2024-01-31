package RotateOfArray;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));



        // Approach 1
       /* rotate(arr,k);
        System.out.println(Arrays.toString(arr));*/

    }
   /*  public static void rotate(int[]arr,int k){
       for(int i=0;i<k;i++){
           int temp=arr[arr.length-1];
           for (int j=arr.length-1;j>0;j--){
               arr[j]=arr[j-1];
           }
           arr[0]=temp;
       }

     }*/

    // Approach 2 optimal

        public static void rotate(int[] nums, int k) {
            int[] a=new int[nums.length];
            for(int i=0;i<nums.length;i++)
                a[(i+k)%nums.length]=nums[i];
            for(int i=0;i<nums.length;i++)
                nums[i]=a[i];
        }


}
