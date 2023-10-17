package Oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
      // Box box = new Box(2,4,6);
      //  Box box2 = new Box(box);
        /* BoxWeight box1= new BoxWeight(2,3,4,5);
        System.out.println(box1.l+" "+box1.h+" "+box1.w+" "+box1.weight);
        System.out.println(box.l+" " +box.h +" " + box.w);*/
        BoxPrice box= new BoxPrice(6);
        System.out.println(box.cost);

    }
}
