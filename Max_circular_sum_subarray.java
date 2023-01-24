public class Max_circular_sum_subarray {
    public static void main(String[] args) {
        int[] arr = {-1,40,-14,7,6,5,-4,-1};
        int n = arr.length;
        System.out.println(max_circular(arr,n));
    }
    public static int max_sum(int[] arr,int n){
        int maxEnding = arr[0];
        int res = arr[0];
        for(int i = 1;i<n;i++){
            maxEnding = Math.max(maxEnding + arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
    public static int max_circular(int[] arr,int n){
        int max_normal = max_sum(arr,n);
        int arr_sum = 0;
        for(int i = 0;i<n;i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + max_sum(arr,n);
        return Math.max(max_circular,max_normal);
    }
}
