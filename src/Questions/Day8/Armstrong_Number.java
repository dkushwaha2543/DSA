package Questions.Day8;

public class Armstrong_Number {
    public static void main(String[] args) {
       int num=153;
       int temp=num;
       int r,sum=0;
       while (num>0){
           r=num%10;
           sum+=r*r*r;
            num=num/10;
       }
       if (temp==sum){
           System.out.println("Its an Armstrong number ");
       }else {
           System.out.println(" Not an Armstrong number ");
       }
    }
}
