package Recursion;
// Sum of N to 1 number
public class SumOfNNum {
    public static void main(String[] args) {
        int ans=sum(5);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
}
