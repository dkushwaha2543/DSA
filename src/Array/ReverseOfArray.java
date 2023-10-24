package Array;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
       /* reverse(arr);
        System.out.println(Arrays.toString(arr));
*/

       reverse(arr);
       print(arr);
    }

    // method to reverse array
    public static void reverse(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void print(int[]arr){
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // second method to reverse an array

}
