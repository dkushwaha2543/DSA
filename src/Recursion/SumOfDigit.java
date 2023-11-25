package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int num=1234;
        int ans=DigitSum(num);
        System.out.println(ans);
    }
    static int DigitSum(int num){
        if (num==0){
            return 0;
        }
        return (num%10)+DigitSum(num/10);
    }
}
