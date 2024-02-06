package MultiDimensionalArray;
import java.util.ArrayList;
import java.util.List;
//Spiral Traversal of Matrix
//Problem Statement: Given a Matrix, print the given matrix in spiral order.

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        List<Integer> result=spiralOrder(matrix);
        System.out.println(result);

}
public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return result;
        }
        int toprow=0;
        int bottomrow=matrix.length-1;
        int firstcol=0;
        int lastcol=matrix[0].length-1;

        while(toprow<=bottomrow && firstcol<=lastcol){
            // traversing toprow
            for(int i=firstcol;i<=lastcol;i++){
                result.add(matrix[toprow][i]);
            }
            toprow++;
            // traversing lastcol
            for(int i=toprow;i<=bottomrow;i++){
                result.add(matrix[i][lastcol]);
            }
            lastcol--;
            // traversing bottomrow
            if(toprow<=bottomrow){
                for(int i=lastcol;i>=firstcol;i--){
                    result.add(matrix[bottomrow][i]);
                }
                bottomrow--;
            }
            // traversing firstcol
            if(firstcol<=lastcol){
                for(int i=bottomrow;i>=toprow;i--){
                    result.add(matrix[i][firstcol]);
                }
                firstcol++;
            }
        }
        return result;
    }
}
