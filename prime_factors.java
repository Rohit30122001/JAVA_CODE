public class prime_factors {
    public static int primeFactors(int n){
        for(int i =2 ;i<n;i++){
            if(isPrime(i))
            {
                int x = i;
                while(n%x== 0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
        return n;
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i = 5;i*i<n;i = i + 6){
            if (n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(20));
    }
}
