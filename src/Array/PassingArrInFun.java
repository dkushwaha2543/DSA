package Array;

import java.util.Arrays;

// Passing Array in function
public class PassingArrInFun {
    public static void main(String[] args) {
        int[]nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[]nums){
        nums[0]=2;
    }
}
