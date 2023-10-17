package BinarySearch;

public class BinarySearch5 {
    public static void main(String[] args) {
        int[]arr= {22,23,24,25,};
        int t= 22;
        int ans=Search(arr,t);
        System.out.println(ans);
    }
    static int Search(int[]arr,int t){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(t<arr[m]){
                e=m-1;
            } else if (t>arr[m]) {
                s=m+1;

            }else{
                return m;
            }
        }
        return -1;
    }
}
