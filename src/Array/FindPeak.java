package Array;
//You are given a 0-indexed array mountain.
// Your task is to find all the peaks in the mountain array.
//
//Return an array that consists of indices of peaks in the given array in any order.
//
//Notes:
//
//A peak is defined as an element that is strictly greater than
// its neighboring elements.
//The first and last elements of the array are not a peak.

import java.util.ArrayList;
import java.util.List;

public class FindPeak {
    public static void main(String[] args) {
        int[]peak={2,4,4};
        List<Integer>result= Peak(peak);
        System.out.println(result);
    }
    public static List<Integer> Peak(int[]peak){
        List<Integer>result=new ArrayList<>();
        int i=1;
        while(i<peak.length-1){
            if(peak[i]>peak[i-1] && peak[i]>peak[i+1]){
                result.add(i);
            }
            i++;
        }
        return result;
    }
}
