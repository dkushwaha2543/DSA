package String;
// Printing the Path
public class MazePrintingPath {
    public static void main(String[] args) {
        path(" ",3,3);
    }
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.print(p+" ");
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
        if(r>1 && c>1){
            path(p+'a',r-1,c-1);
        }
    }
}
