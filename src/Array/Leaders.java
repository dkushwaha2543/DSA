package Array;
//Leaders in an Array
//Problem Statement: Given an array, print all the elements which are leaders.
// A Leader is an element that is greater than all of the elements on
// its right side in the array.
import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[]arr={10, 22, 12, 3, 0, 6};
        List<Integer>leaders =FindLeaders(arr);
        System.out.println("Leaders : " + leaders);
    }
    public static List<Integer>FindLeaders(int[]arr){
        List<Integer>leaders=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           boolean isLeader= true;
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   isLeader=false;
                   break;
               }
           }
           if(isLeader){
               leaders.add(arr[i]);
           }
        }
        return leaders;
    }
}
