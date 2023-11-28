package BinarySearchUsingRecursion;

public class FindTargetElement {
    public static void main(String[] args) {
       int[]arr={11,22,33,44,55,66,77,88};
       int target=88;
       int s=0;
       int e=arr.length-1;
        System.out.println(search(arr,target,s,e));
    }
    static int search(int[]arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if (target>arr[mid]){
            return search(arr,target,s+1,e);
        }
        return search(arr,target,s,e-1);
    }
}
