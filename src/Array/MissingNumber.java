package Array;
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
      int[]nums={9,6,4,2,3,5,7,0,1};
      int ans=missingNumber(nums);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
