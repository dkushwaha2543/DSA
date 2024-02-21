package MathDataStructures;
// Find the Number of Digit in base b
public class NumberOfDigitInBaseB {
    public static void main(String[] args) {
        int num=12345;
        int base=2;
        int ans=digitInBaseB(num,base);
        System.out.println(ans);
    }
    public static int digitInBaseB(int num,int base){
        return (int)(Math.log(num)/Math.log(base))+1;
    }
}
