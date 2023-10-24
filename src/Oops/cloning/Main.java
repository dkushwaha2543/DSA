package Oops.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human deepak=new Human(22,"Deepak");
       Human twin = (Human) deepak.clone();
        System.out.println(twin.age+ " " +twin.name);
    }
}
