package ArraySorting;


// Descending order
//insertionSort

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[]arr={1,3,2,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]) {
                    swap(arr, j,j-1);
                }
            }
        }
    }
    static void swap(int[]arr,int f,int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
