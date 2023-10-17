package Oops.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight=5;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// what is this ? call the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }
}
