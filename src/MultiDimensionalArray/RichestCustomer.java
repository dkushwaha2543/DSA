package MultiDimensionalArray;
//You are given an m x n integer grid accounts where accounts[i][j]
// is the amount of money the i​​​​​​​​​​​th​​​​
// customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
public class RichestCustomer {
    public static void main(String[] args) {
    int[][]accounts={{2,8,7},{7,1,3},{1,9,5}};
    int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int maxWealth=0;
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(maxWealth<=sum){
                maxWealth=sum;
//                sum=0;
            }
            sum=0;
        }
        return maxWealth;
    }
}
