package Array;
// Using temporary array for deleting duplicate element
public class RemovedDuplicates {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,4,4,5,5,6,7};
        int n=arr.length;
        n=removeDuplicates(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
   static  int removeDuplicates(int[]arr,int n) {
       if (n == 0 || n == 1) {
           return n;
       }
       int[] temp = new int[n];
       int j = 0;
       for (int i = 0; i < n-1; i++) {
           if (arr[i] != arr[i + 1]) {
               temp[j++] = arr[i];
           }
       }
           temp[j++]=arr[n-1];

       for (int i = 0; i < j; i++) {
           arr[i] = temp[i];
       }
       return j;
   }
}
