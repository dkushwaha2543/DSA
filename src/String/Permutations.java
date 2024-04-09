package String;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
      // permutations("","abc");


        /*ArrayList<String>anss=permutationList("","abc");
        System.out.println(anss);*/

        int ans =permutationsCount("","abc");
        System.out.println(ans);
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }

    // using ArrayList


    static ArrayList<String>permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

      // No permutations
    static int permutationsCount(String p,String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
