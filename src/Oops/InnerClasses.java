package Oops;

public class InnerClasses {
   static class Tast{
        String name;
        public Tast(String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println("hieifiej");
        }
    }

    public static void main(String[] args) {
        Tast a = new Tast("Deepak kushwaha");
        Tast b = new Tast("Sandeep kushwaha");

        InnerClasses classes = new InnerClasses();
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
