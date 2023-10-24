package ArraySorting.Bubblesort;

import java.util.Arrays;

public class Bubble1 {
    public static void main(String[] args) {
        int[]arr={2,3,1,4};
        for (int i=0;i<arr.length;i++){

                System.out.print(arr[i]+" ");

        }
        System.out.println();
        bubble(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}



