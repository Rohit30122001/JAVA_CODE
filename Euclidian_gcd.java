public class Euclidian_gcd {
    public static int gcd_numbers(int a, int b){
        while(a != b){
            if(a>b){
                a=a-b;
            }
            else
                b=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd_numbers(10,200));
    }
}
