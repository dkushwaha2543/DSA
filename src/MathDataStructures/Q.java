package MathDataStructures;

public class Q {
    public static void main(String[] args) {
        int n= 40;
        boolean[]prime=new boolean[n+1];
        sieve(n,prime);

    }
    static void sieve(int n,boolean[]prime){
        for (int i=2;i*i<=n;i++){
            if (!prime[i]){
                for (int j=i*2;j<=n;j+=i){
                    prime[i]=true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
