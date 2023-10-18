package Oops.Abstration;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Son son=new Son(24);
        son.God();

        Daughter daughter=new Daughter(22);
        daughter.career();

        Parent.hello();


    }
}
