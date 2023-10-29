package Questions.Day7;
//Find if a number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp=num;
        int sum=0;
        while (num>0){
            int revs=num%10;
            sum=(sum*10)+revs;
            num=num/10;
        }
        if (temp==sum){
            System.out.println(" Palindrome number is "+ sum);
        }
        else{
            System.out.println(" Not palindrome number "+ sum);
        }
    }
}
