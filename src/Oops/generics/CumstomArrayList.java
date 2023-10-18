package Oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CumstomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CumstomArrayList(){
        this.data=new int[DEFAULT_SIZE];

    }
    public void add(int num){
        if (isfull()){
            resize();
        }
        data[size++]=num;

    }
    private void resize(){
      int[]temp= new int[data.length*2];
      // copy the current item in the new array

        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
        }
        private boolean isfull(){
        return size==data.length;
        }
        public int remove(){
        int removed=data[--size];
        return removed;

        }
        public int get(int index){
        return data[index];
        }
        public int size(){
        return size;
        }
        public void set(int index,int value){
        data[index]= value;
        }


    @Override
    public String toString() {
        return "CumstomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       // ArrayList list= new ArrayList();
        CumstomArrayList list= new CumstomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        System.out.println(list);
        for (int i=0;i<14;i++){
            list.add(2*i);
        }
        System.out.println(list);
   }
}
