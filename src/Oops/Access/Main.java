package Oops.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(3, "Deepak");
        // 1. access the data members
        // 2.modify the data members
       int a= obj.getNum();
       String d= obj.name;
        System.out.println(d);
        System.out.println(a);
    }
}
