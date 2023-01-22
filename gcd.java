public class gcd {
    public static int gcdOfTwoNumbers(int a, int b){
        if(b == 0){
            return a;
        }
        return gcdOfTwoNumbers(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfTwoNumbers(15,12));

    }
}
