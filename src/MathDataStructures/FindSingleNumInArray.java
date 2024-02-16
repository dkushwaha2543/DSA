package MathDataStructures;
// Find the single number in given array every number is twice accept one number
public class FindSingleNumInArray {
    public static void main(String[] args) {
        int[]arr={2,3,4,1,2,1,3,6,4};
        int ans=singleNumber(arr);
        System.out.println("Single Number is " + ans);
    }
    public static int singleNumber(int[]arr){
        int singleNum=0;
        for(int n:arr){
            singleNum^=n;
        }
        return singleNum;
    }
}
