package MultiDimensionalArray;

public class CountNegetive {
    public static void main(String[] args) {
        int[][]grid={{5,1,0},{-5,-5,-5}};
        int ans=countNegatives(grid);
        System.out.println(ans);
    }
    public static int countNegatives(int[][] grid) {
        int temp=0,count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
            temp+=count;
            count=0;
        }
        return temp;
    }
}
