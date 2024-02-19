package Array;

public class MajorityElement {
    public static void main(String[] args) {
       int[]nums={3,3,4};
       int ans=majorityElement(nums);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int majorityElement=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
          int count=0;
            for(int j=0;j<nums.length;j++) {
                if (nums[i] == nums[j])
                    count++;
                 // nums[i];
            }

            if(majorityElement<count){
                majorityElement=count;
                element=nums[i];
                count=0;
            }
        }
        if(nums.length/2 < majorityElement){
            return element;
        }
        return -1;

    }
}
