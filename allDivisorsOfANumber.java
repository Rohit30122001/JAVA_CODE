public class allDivisorsOfANumber {
    public static int divisors(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0)
                System.out.println(i);
        }
        for(;i>=1;i--){
            if(n%i==0)
                System.out.println(n/i);
        }
        return i;
    }

    public static void main(String[] args) {
     int all_divisors =  divisors(10);
        System.out.println(all_divisors);
    }
}
