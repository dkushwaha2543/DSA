package Array;
//Given a non-empty array of integers nums,
// every element appears twice except for one. Find that single one.
//You must implement a solution with a linear
// runtime complexity and use only constant extra space.
public class FindSingleNumberInArray {
    public static void main(String[] args) {
        int[]nums={2,2,1};
        int ans=singleNumber(nums);
        System.out.println(ans);
    }
    public static int singleNumber(int[]nums){
            int singleNumber=0;
            for(int i=0;i<nums.length;i++){
                singleNumber=singleNumber^nums[i];
            }
            return singleNumber;
        }
    }
