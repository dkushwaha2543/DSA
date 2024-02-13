package MultiDimensionalArray;

import java.util.Arrays;

public class MaxOnes {
    public static void main(String[] args) {
       int[][]mat={{0,0},{1,1},{0,0}};
       int[] ans=rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int max1=0;
        int numrow=0;
        for(int i=0;i<r;i++){
             int count=0;

            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(max1<count){
                max1=count;
                numrow=i;

            }

        }
        return new int[]{numrow,max1};
    }
}
