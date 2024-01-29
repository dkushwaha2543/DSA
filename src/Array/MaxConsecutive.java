package Array;
// Count Maximum Consecutive One’s in the array
//Problem Statement: Given an array that contains only 1 and 0 return
// the count of maximum consecutive ones in the array.
public class MaxConsecutive {
    public static void main(String[] args) {
        int[]arr={1,1,0,1,1,1};
        int ans= maxConsecutive(arr);
        System.out.println(ans);
    }

    // Brute Force Approach


  /*  public static void maxConsecutive(int[]arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==1){
            count++;
           }else if(count>maxCount){
               maxCount=count;
               count=0;

           }
        }
        System.out.println(Math.max(count,maxCount));

    }*/
     //  Optimal Approach

    public static int maxConsecutive(int[]arr){
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else {
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count,maxCount);
    }
}
