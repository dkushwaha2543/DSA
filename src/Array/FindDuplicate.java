package Array;

import java.util.Arrays;

//Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class FindDuplicate {
    public static void main(String[] args) {
       int[] arr={1,1,1,3,3,4,3,2,4,2};
       boolean ans=containsDuplicate(arr);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[]arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }

        }
        return false;
    }
}
