public class power {
    public static int power_of_number(int x,int n){
         if(n==0){
             return 1;
         }
         int temp = power_of_number(x,n/2);
         temp = temp*temp;
         if(n%2==0){
             return temp;
         }
         return temp*x;
    }


    public static void main(String[] args) {
        System.out.println(power_of_number(25,2));
    }
}
