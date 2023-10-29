package Questions.Day6;

import java.util.Arrays;
import java.util.Scanner;

// Calculate Depreciation of Value
public class DepreciationofValue {
    public static void main(String[] args) {
        // Straight line Depreciation method=
        //(cost of an Asset-Residual value)/useful life of an Asset
//        Scanner sc=new Scanner(System.in);
//        System.out.println(" Enter the cost of an asset ");
//        double costOfAsset=sc.nextDouble();
//        System.out.println(" Enter the Residual value");
//        double residualValue=sc.nextDouble();
//        System.out.println(" Enter the useful life of an asset");
//        double LifeOfAsset= sc.nextDouble();
//        double depreciation=(costOfAsset-residualValue)/LifeOfAsset;
//        System.out.println(" Calculate Depreciation of Value "+ depreciation);
        int[] num={1,2,3,4,5};
        int[] ans=new int[num.length];
        answ(num, ans);
        print(ans);
    }


    public static int[] answ(int[] que,int[]anss){
        for (int i=0; i<=anss.length-1; i++){
            int a = i+1;
            if (a%2==0){
                anss[i] =2*que[i];
            }else {
                anss[i]=que[i];
            }
        }
        return anss;
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}
