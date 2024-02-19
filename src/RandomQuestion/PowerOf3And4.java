package RandomQuestion;
/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.*/
public class PowerOf3And4 {
    public static void main(String[] args) {
      int n=10;
      boolean ans=isPowerOfThree(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}
