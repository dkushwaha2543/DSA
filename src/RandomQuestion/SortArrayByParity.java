package RandomQuestion;
/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.*/
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[]nums={3,1,2,4};
        int[] ans=sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortArrayByParity(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] % 2 == 0) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (i = 0; i < temp.length; i++) {
            nums[start + i] = temp[i];
        }

    }
}
