public class count_digits {

    static int countDigits(long n){
        int count = 0;
        while(n!=0){
            n=n/10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        long n = 345289467;
        System.out.println(countDigits(n));

    }
}
