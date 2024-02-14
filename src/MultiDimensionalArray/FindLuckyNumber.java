package MultiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class FindLuckyNumber {
    public static void main(String[] args) {
        int[][]matrix={{3,7,8},{9,11,13},{15,16,17}};
        ArrayList<Integer> ans= (ArrayList<Integer>) luckyNumbers(matrix);
        System.out.println(ans);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> lucky= new ArrayList<>();
        // minimum in each row
        int[]minInRow=new int [m];
        for(int i=0;i<m;i++){
            int minRow= matrix[i][0];
            for(int j=0;j<n;j++){
                minRow=Math.min(minRow,matrix[i][j]);
            }
            minInRow[i]=minRow;
        }
        // maximum in each column
        int[]maxInCol=new int[n];
        for(int j=0;j<n;j++){
            int maxCol=matrix[0][j];
            for(int i=1;i<m;i++){
                maxCol=Math.max(maxCol,matrix[i][j]);
            }
            maxInCol[j]=maxCol;
        }
        // for lucky number
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int num=matrix[i][j];
                if(num==minInRow[i] && num==maxInCol[j]){
                    lucky.add(num);
                }
            }
        }
        return lucky;
    }
}
