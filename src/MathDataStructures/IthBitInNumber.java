package MathDataStructures;
// Find the ith bit of a Number
public class IthBitInNumber {
    public static void main(String[] args) {
        int number = 4;
        int bitPosition=2;
        int ans=ithBit(number,bitPosition);
        System.out.println(ans);
    }

    public static int ithBit(int number,int bitPosition) {

        return 1 & (number>>bitPosition);
    }

}
