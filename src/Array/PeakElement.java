package Array;
/*
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums,
 find a peak element, and return its index.
 If the array contains multiple peaks,
 return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.
 In other words, an element is always considered to be strictly
 greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
*/

public class PeakElement {
    public static void main(String[] args) {
      int[]nums={1};
      int ans=findPeakElement(nums);
        System.out.println(ans);
    }
    public  static int findPeakElement(int[] nums) {
        int i;
        //This way, the variable i is declared outside the loop,
        // making it accessible in the return statement.
        int peak=0;
        for( i=0;i<nums.length-1;i++){

            if(nums[i]<nums[i+1])
                peak=i+1;
        }
        return peak;
    }
}
