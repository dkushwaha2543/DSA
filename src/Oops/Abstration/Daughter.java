package Oops.Abstration;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);

    }

    @Override
    void career(){
        System.out.println(" Be Dancer");
    }
    @Override
    void God(){
        System.out.println("Maa Kali");
    }

}
