public class efficientPrimeFactors {
    public static void effPrimeFactors(int n){
        if(n<=1){
            return;
        }
        for(int i = 2;i*i<=n;i++){
            while(n%i == 0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1)
            System.out.println(n
            );
    }
}
