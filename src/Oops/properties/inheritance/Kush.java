package Oops.properties.inheritance;

public class Kush {
    int age;
    String  name;
    int income;

    public Kush(int age, String name, int income) {
        this.age = age;
        this.name = name;
        this.income = income;
    }

    public static void main(String[] args) {
        Kush kush = new Kush(22,"Deepak",4500);
        Box box = new Box(3,45,5);
        System.out.println(box.l+" "+box.h+" "+box.w);
        System.out.println(kush.age+" "+kush.name+" "+kush.income);
    }
}

