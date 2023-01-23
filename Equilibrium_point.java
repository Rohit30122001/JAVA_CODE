public class Equilibrium_point {

    public static void main(String[] args) {

        int arr[] = { 4,2,8,0,6,4,2,2 };
        int n = arr.length;
        int arr_size = arr.length;
        System.out.println(Equi_point(arr,n));
    }

    public static int Equi_point(int[] arr,int n){
        int sum = 0;
        int left_sum = 0;

        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        for(int j = 0;j<n;j++){
            sum -= arr[j];

            if(left_sum == sum){
                return j;
            }
            left_sum += arr[j];
        }
        return -1;
    }
}
