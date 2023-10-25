package RotateOfArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotatekthTerm {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[]arr){
        int i=0;
        int j=arr.length-1;
      while (i<=j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
      }
    }

}
