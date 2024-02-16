package RandomQuestion;
//  If perfect number return true and false
public class PerfectNumber {
    public static void main(String[] args) {
        int num =28;
        boolean ans=checkPerfectNumber(num);
        System.out.println(ans);
    }
    public static boolean checkPerfectNumber(int num) {
        int sum=0;
        // int temp=num;
        for(int i=1;i<num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
            if(sum==num){
                return true;
            }

        return false;
    }
}
