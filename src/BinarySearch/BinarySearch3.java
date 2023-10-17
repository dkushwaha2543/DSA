package BinarySearch;

public class BinarySearch3 {
    public static void main(String[] args) {
        int []arr={12,11,10,9,8,7,6,5,4,3,2,1};
        int t=7;
        int ans=search(arr,t);
        System.out.println(ans);
    }
    static int search(int []arr,int t){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(t>arr[mid]){
                e=mid-1;
            } else if (t < arr[mid]) {
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
}
