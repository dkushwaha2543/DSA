package Array;
//Find second Smallest Element in an array
import java. util.Arrays;
public class ScSmElement {
    public static void main(String[] args) {
      int[]arr={1,2,4,7,7,5};
      SecondSmallest(arr);
      print(arr);
    }
    static void SecondSmallest(int[]arr){
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
    }
    static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(" Second smallest number in array "+ arr[arr.length-1-1]);
    }
}
