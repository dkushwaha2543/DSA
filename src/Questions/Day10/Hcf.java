package Questions.Day10;
// Highest common factor

public class Hcf {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.println(" Highest common factor "+ a +" and "+ b +" is "+hcf(a,b));
    }
    static int hcf(int a,int b){
        if (b==0){
            return a;
        }else {
            return hcf(b,a%b);
        }
    }
}
