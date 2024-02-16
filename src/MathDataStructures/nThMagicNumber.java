package MathDataStructures;
// Find the nth magic number
/* Use formula n&1= this will give me last Digit in binary
  n>>1*/
public class nThMagicNumber {
    public static void main(String[] args) {
        int number=5;
        int base=5;
        int ans1= nThMagic(number,base);
        System.out.println(ans1);
    }
    public static int nThMagic(int number,int base){
        int ans=0;
        int last;
        while (number>0){
            last=number&1;
            number=number>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;

        // approach 2
        // public static int nThMagic(int number, int base) {
        //        int pow = 1;
        //        int ans = 0;
        //
        //        // Find the magic number using formula
        //        while (number > 0) {
        //            pow *= base;
        //
        //            // If the least significant bit of n is set
        //            if ((number & 1) == 1) {
        //                ans += pow;
        //            }
        //
        //            // Move to the next bit
        //            number >>= 1;
        //        }
        //        return ans;
    }
}
