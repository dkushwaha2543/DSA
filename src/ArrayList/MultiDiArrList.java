package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDiArrList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i);
            }
            System.out.println(list);
        }
        System.out.println();
    }
}
