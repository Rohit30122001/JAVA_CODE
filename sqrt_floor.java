public class sqrt_floor {
    public static void main(String[] args) {

        int x = 24;
        System.out.print(sqrt(x));
    }
    static int sqrt(int x){
        int low = 0,high = x;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            int msv = mid * mid;
            if(msv == x){
                return mid;
            }
            else if(msv > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
