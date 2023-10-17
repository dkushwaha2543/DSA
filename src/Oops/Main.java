package Oops;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human.child child = human.new child(1, 5);
        child.printChild();
    }
}
