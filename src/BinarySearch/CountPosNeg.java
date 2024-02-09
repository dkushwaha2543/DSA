package BinarySearch;
//Given an array nums sorted in non-decreasing order,
// return the maximum between the number of positive integers and the number of negative integers.
//
//In other words, if the number of positive integers in nums
// is pos and the number of negative integers is neg, then return the maximum of pos and neg.
//Note that 0 is neither positive nor negative.
public class CountPosNeg {
    public static void main(String[] args) {
      int[]nums={-3,-2,-1,0,0,1,2};
      int ans=maximumCount(nums);
        System.out.println(ans);
    }
    public static int maximumCount(int[] nums) {
        int countNeg=0;
        int countPos=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]>0){
                countPos++;
            }else if(nums[i]==0){
                continue;
            }
            else {
                countNeg++;
            }
        }
        return Math.max(countNeg,countPos);
    }
}
