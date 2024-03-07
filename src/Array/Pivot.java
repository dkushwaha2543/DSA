package Array;

public class Pivot {
    public static void main(String[] args) {
        int n = 8;
        int ans = Pivot(n);
        System.out.println(ans);
    }

    public static int Pivot(int n) {
        int leftval = 1;
        int rightval = n;
        int sumLeft = leftval;
        int sumRight = rightval;

        if (n == 1) {
            return n;
        }

        while (leftval < rightval) {
            if (sumLeft < sumRight) {
                sumLeft += ++leftval;

            } else {
                sumRight += --rightval;
            }
            if (sumLeft == sumRight && leftval + 1 == rightval - 1) {
                return leftval + 1;
            }
        }
        return -1;
    }
}
