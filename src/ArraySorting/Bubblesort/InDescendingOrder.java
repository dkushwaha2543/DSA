package ArraySorting.Bubblesort;

import java.util.Arrays;

public class InDescendingOrder {
    public static void main(String[] args) {
        int[]arr={1,2,5,4,3};
        descending(arr);
      //  System.out.println(Arrays.toString(arr));
        print(arr);
    }
    public static void descending(int[]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void print(int[]arr){
        System.out.print("[ ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
