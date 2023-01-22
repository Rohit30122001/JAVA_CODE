public class palindrome_number {

   static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int ld = temp%10;
            rev = rev*10 + ld;
            temp = temp/10;
        }
        return (rev == n);
    }

    public static void main(String[] args) {

        int n  = 2442;
        System.out.println(isPalindrome(n));

    }
}
