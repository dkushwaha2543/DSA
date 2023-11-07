package Questions.Day13;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;// Because we need the original num to check the number is palindrome or not
        palindrome(num,temp);
        }
        static void palindrome(int num,int temp){
        int sum=0;
        while (num>0){
            int r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum){
            System.out.println(" Number is palindrome ");
        }
        else {
            System.out.println(" Number is not palindrome ");
        }
        }


    }


