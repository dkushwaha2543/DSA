package Array;

import java.util.Arrays;

//Given an array of integers nums containing n + 1
// integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums,
// return this repeated number.
//You must solve the problem without modifying the array nums
// and uses only constant extra space.
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
//        int[] an = findDuplicate(nums);
//        System.out.println(an);
       int ans=findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
//        List<Integer> duplicale = new ArrayList<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//               if(nums[i]==nums[j]){
//                   return nums[i];
//               }else {
//                   duplicale.add(i);
//               }
//            }
//
//        }
//        return -1;
         int i=0;
         while (i<nums.length){
             int correct=nums[i]-1;
             if(nums[i]!=nums[correct]){
                 swap(nums,i,correct);
             }
             else {
                 i++;
             }
         }
         for(int index=0;index<nums.length;index++){
             if(nums[index]!=index+1){
                 return nums[index];
             }
         }
         return -1;
    }
   static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
   }
}
