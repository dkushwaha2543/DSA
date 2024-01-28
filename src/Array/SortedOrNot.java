package Array;
// Array is sorted or not
public class SortedOrNot {
    public static void main(String[] args) {
       int[]arr={5,6,7,8,2};
       boolean ans= sortedOrNot(arr);
        System.out.println(ans);
    }
    static boolean sortedOrNot(int[]arr){
        if(arr.length==0 || arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
