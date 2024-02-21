package Array;
/*Given an array nums sorted in non-decreasing order,
return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums
is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.*/
public class MaxPositiveAndNegative {
    public static void main(String[] args) {
        int[]nums={-4,-2,-1,0,3,5,4,6,0,0};
        System.out.println(maxPosNeg(nums));
    }
    public static int maxPosNeg(int[]nums){
      return Math.max(maxPosCount(nums,0,nums.length-1),maxNegCount(nums,0,nums.length-1));
    }
    public static int maxPosCount(int[]nums,int start,int end){
        if(start>end){
            return 0;
        }
        if(nums[start]>0){
            return 1+maxPosCount(nums,start+1,end);
        }else{
        return maxPosCount(nums,start+1,end);
    }
}
public static int maxNegCount(int[]nums,int start,int end) {
    if (start > end) {
        return 0;
    }
    if (nums[start] < 0) {
        return 1 + maxNegCount(nums, start + 1, end);
    }else{
    return maxNegCount(nums, start + 1, end);
        }
    }
}