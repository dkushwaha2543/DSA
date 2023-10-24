package ArraySorting.Bubblesort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        int[]arr={1,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);

                }
            }
        }
    }
      static   void swap(int[]arr,int f,int s){
        int temp = arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
