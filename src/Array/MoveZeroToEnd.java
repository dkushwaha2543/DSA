package Array;

import java.util.Arrays;

//Move all Zeros to the end of the array
//Problem Statement: You are given an array of integers,
// your task is to move all the zeros in the array to the end of the array
// and move non-negative integers to the front by maintaining their order.

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[]arr={1,0,2,3,0,4,0,1};
        MovieZeros(arr);
        System.out.println(Arrays.toString(arr));

        // Brute Force Approach

       /* MZE(arr);
        System.out.println(Arrays.toString(arr));*/
    }
   /* public static void MZE(int[]arr){
        int[]temp= new int[arr.length];
        int k=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
               temp[k]=arr[i];
               k++;
            }else {
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }*/

   // Optimal Approach( Using 2 pointers)
    public static void MovieZeros(int[]arr){
     if(arr.length==1){
         return;
     }
     int nonZeroIndex=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]!=0){
           arr[nonZeroIndex]=arr[i];
           nonZeroIndex++;
         }
     }
     while(nonZeroIndex<arr.length){
         arr[nonZeroIndex]=0;
         nonZeroIndex++;
     }
    }

}
