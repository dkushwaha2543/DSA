package Array;

import java.util.Arrays;

// Find the largest element in array
public class LargestElInArr {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
         sort(arr);
       // System.out.println(Arrays.toString(arr));
        print(arr);
    }
    static void sort(int[]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    static void print(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.print(arr[arr.length-1]);
    }
}

