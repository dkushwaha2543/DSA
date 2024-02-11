package MultiDimensionalArray;
//Given an m x n binary matrix mat,
// return the number of special positions in mat.
//
//A position (i, j) is called special if mat[i][j] == 1
// and all other elements in row i and column j are 0
// (rows and columns are 0-indexed).
public class SpecialNumber {
    public static void main(String[] args) {
        int[][]mat={{1,0,0},
                    {0,0,1},
                    {1,0,0}};
        int ans= numSpecial(mat);
        System.out.println(ans);

    }
    public static int numSpecial(int[][]mat){
        int count=0;
        int r=mat.length;
        int c=mat[0].length;
        int[]rcount=new int [r];
        int[]ccount=new int [c];
        // Count the number of ones in each row and col
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    rcount[i]++;
                    ccount[j]++;
                }
            }
        }
        // check for special position
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1 && rcount[i]==1 && ccount[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}

