package BinarySearchUsingRecursion;

public class BS {
    public static void main(String[] args) {
        int[]arr={-1,0,3,5,9,12};
        int target=9;
        int start=0;
        int end=arr.length-1;
        System.out.println(search(arr,target,start,end));
    }
    // Start and end variable theis are pass in function call ,put into the argument
    // mid-value is not beneficial for future call , put in side the body
    static int search(int[]arr,int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid= start+(end-start)/2;
        if (arr[mid]==target){
            return  mid;
        }
        if (target<arr[mid]){
            return search(arr,target,start,end-1);
        }
        return search(arr,target,start+1,end);
    }
}
