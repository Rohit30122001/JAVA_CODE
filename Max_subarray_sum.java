public class Max_subarray_sum {

    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;
        System.out.print(max_sum(arr,n));
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
}
