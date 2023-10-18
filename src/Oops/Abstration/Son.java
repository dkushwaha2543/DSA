package Oops.Abstration;

public class Son extends Parent{
    public Son(int age) {
        super( age);

    }

    @Override
    void career(){
        System.out.println("I am learning coding");
    }
    @Override
    void God(){
        System.out.println(" Shree Krishna  ");
    }
}
