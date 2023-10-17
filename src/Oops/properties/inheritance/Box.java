package Oops.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.l= 1;
        this.h=2;
        this.w=3;
    }
    // cube
    Box(double side){
        // super (); object class
        this.l=side;
        this.h=side;
        this.w=side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}
