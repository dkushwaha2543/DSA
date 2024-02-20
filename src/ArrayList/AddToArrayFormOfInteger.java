package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//989. Add to Array-Form of Integer
//Easy
//Topics
//Companies
//The array-form of an integer num is an array representing
// its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k,
// return the array-form of the integer num + k.
//
//
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
     int[]num={9,9,9,9,9,9,9,9,9,9};
     int k=1;
     ArrayList<Integer> ans= (ArrayList<Integer>) addToArrayForm(num,k);
        System.out.println(ans);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> addNewArray=new ArrayList<>();
        ArrayList<Integer>addArray=new ArrayList<>();
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum= (sum*10)+num[i];
        }
        sum=sum+k;
        while(sum>0){
            int modulo=sum%10;
            addNewArray.add(modulo);
             sum/=10;
        }
      Collections.sort(addNewArray);
        return addNewArray;
    }
}
