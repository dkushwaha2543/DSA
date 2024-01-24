package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList< Integer>();
        // add elements
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list + " ");

        // get elements
        int element=list.get(2);
        System.out.println(element);

        // add elements in b/n
        list.add(0,1);
        System.out.println(list);

        // set elements
        System.out.println("New Array list");
        list.set(2,5);
        System.out.println(list);

        // delete element
        System.out.println("After deleting ");
        list.remove(3);
        System.out.println(list);

        // size
        System.out.println("Array size");
        int size = list.size();
        System.out.println(size);

        // loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");

        // Sorting
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.print(list);
    }
}
