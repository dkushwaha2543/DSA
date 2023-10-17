package BinarySearch;

public class BinarySearch4 {
    public static void main(String[] args) {
        int[]arr={9,7,5,3,1};
        int t=5;
        int ans=search(arr,t);
        System.out.println(ans);
    }
    static int search(int[]arr,int t){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int m=s+(e-s)/2;
            if(t<arr[m]){
                s=m+1;
            } else if (t>arr[m]) {
                e=m-1;
            }else {
                return m;
            }
        }
        return 0;
    }
}
