import java.util.Arrays;

public class sieve {
    public static void sieveEra(int n){
        if(n<=1){
            return;
        }
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i = 2; i*i <=n;i++){
            if(isPrime[i]){
                for(int j = 2*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(isPrime[i])
                System.out.println(i + " ");

        }
    }

    public static void main(String[] args) {
        int n = 18;
        sieveEra(n);
    }
}
