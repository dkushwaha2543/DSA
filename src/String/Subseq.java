package String;

public class Subseq {
    public static void main(String[] args) {
      subseq(" ","abc");
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
}
