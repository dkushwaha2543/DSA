package Array;

public class AverageValue {
    public static void main(String[] args) {
        int[]nums={1,2,4,7,10};
        int ans=averageValue(nums);
        System.out.println(ans);
    }
    public static int averageValue(int[] nums) {
        int sum = 0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                sum += nums[i];
                count++;
            }
//            if(count==0){
//                return sum;
            }
            if(count==0){
                return 0;
        }
        return sum /count ;
    }
}

