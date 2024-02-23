package Array;
/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.*/
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
       int[]arr={1,2,3,4};
       int k=2;
       int answer=findKthPositive(arr,k);
        System.out.println(answer);
    }
    public static int findKthPositive(int[] arr, int k) {
        for(int ans:arr){
            if(ans<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}
