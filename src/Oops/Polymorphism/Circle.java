package Oops.Polymorphism;

public class Circle extends Shape{
    // This will run when obj of Circle is created
    //hence it is overriding the parent method
    @Override// This is called annotation
    void area()
    {
        System.out.println(" Area is pie *r*r ");
    }
}
