package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int t=0;
        int ans=search(arr,t);
        System.out.println(ans);
    }
    static int search(int[]arr,int t){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if (t<arr[m]){
                e=m-1;
            } else if (t>arr[m]) {
                s=m+1;

            }else {
                return m;
            }
        }return 0;
    }
}
