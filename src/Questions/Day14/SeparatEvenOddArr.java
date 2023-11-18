package Questions.Day14;

import java.util.Arrays;

//Even and Odd Array Elements
 /*Write a program that takes an array of integers as input and separates
 the even and odd numbers into two separate arrays. Print both arrays.*/
public class SeparatEvenOddArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        separateEvenOdd(arr);
    }
    public static void separateEvenOdd(int[]arr){
        int evenCount=0;
        int oddCount=0;
        for (int num:arr){
            if (num%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        int[]even=new int[evenCount];
        int[]odd=new int[oddCount];
        int evenIndex=0;
        int oddIndex=0;
        for (int num:arr){
            if (num%2==0){
                even[evenIndex]=num;
                evenIndex++;
            }else {
                odd[oddIndex]=num;
                oddIndex++;
            }
        }
        System.out.println("Even Array " + Arrays.toString(even));
        System.out.println(" Odd Array " + Arrays.toString(odd));
    }
}
