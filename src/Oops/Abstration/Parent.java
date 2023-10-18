package Oops.Abstration;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
 //   abstract Parent(); you can not create abstract constructor
     static void hello(){
         System.out.println("Hello");
     }
    abstract void career();
    abstract void God();

}
