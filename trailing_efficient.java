public class trailing_efficient {
    public static int trailing_zeros(int n){
               int res = 0;
               for(int i = 5;i<=n;i=i*5) {
                   res = res + n / i;
               }
                   return res;
               }

    public static void main(String[] args) {
        System.out.println(trailing_zeros(20));
    }
}
