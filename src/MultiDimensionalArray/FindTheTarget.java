package MultiDimensionalArray;
// find the target element in given matrix
import java.util.Arrays;

public class FindTheTarget {
    public static void main(String[] args) {
        int[][]matrix={{1,3,5,7},
                      {10,11,16,20},
                      {23,30,34,60}};
        int target=34;
//       boolean result = searchMatrix(matrix,target);
//        System.out.println(result);

        System.out.println(Arrays.toString(searchMatrix(matrix,target)));
    }
    public static int[] searchMatrix(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};

    }
//  public   static boolean searchMatrix(int[][] matrix, int target) {
//    int r=0;
//    int c =matrix.length-1;
//    while(r<matrix.length && c>=0){
//        if(matrix[r][c] == target){
//            return true;
//        }
//        if(matrix[r][c]<target){
//            r++;
//        }else{
//            c--;
//        }
//    }
//    return false;
 //}
}
