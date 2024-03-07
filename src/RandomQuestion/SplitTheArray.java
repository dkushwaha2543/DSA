package RandomQuestion;

public class SplitTheArray {
    public static void main(String[] args) {
        int[]nums={1,1,1,1};
        boolean ans=isPossibleToSplit(nums);
        System.out.println(ans);
    }
    public static boolean isPossibleToSplit(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count > 2) {
                    return false;
                }

            }
        }
        return true;
    }
}
