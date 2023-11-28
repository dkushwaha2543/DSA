package Recursion;
// Multiply in digit using Recursion
public class MultiInDigite {
    public static void main(String[] args) {
        int num=1234;
        int ans=multi(num);
        System.out.println(ans);
    }
    static int multi(int num){
        if (num%10==num){
            return num;
        }
        return (num%10)*(num/10);
    }
}
