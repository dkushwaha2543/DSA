package Oops.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //  divide(a,b);
            String name = "Deepak";
            if (name.equals("Deepak")) {
                throw new MyException(" name is Deepak");
            }

            //int c = a / b;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println( e.getMessage());
        }catch (Exception e){
            System.out.println(" normal exception ");
        }finally {
            System.out.println(" this will always execute ");
        }
    }
     static int divide(int a,int b)throws ArithmeticException{
      if (b==0){
          throw new ArithmeticException(" please do no divide by zero ");
      }
      return a/b;
    }
}
