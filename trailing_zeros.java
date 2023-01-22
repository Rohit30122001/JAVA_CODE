public class trailing_zeros {

    public static int trailing_zeros_in_fact(int n){
        int fact = 1;
        int count = 0;
        for(int i = 2;i <= n;i++){
            fact = fact * i;
        }
        while(fact % 10 == 0){
            count++;
            fact = fact/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailing_zeros_in_fact(20));

    }
}
