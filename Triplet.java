public class Triplet {
    public static void main(String[] args) {

        int[] arr = {12,3,4,1,6,9};
        int sum = 24;
        System.out.print(is_triplet(arr,sum));
    }
    static boolean is_triplet(int[] arr, int x) {
        int n = arr.length;
        int i = 0,si = i+1,j = n-1;
        for (i = 0; i < n - 2; i++) {
            while(si < j){
                if(arr[si] + arr[j] == (x-arr[i])){
                    return true;
                }
                else if(arr[si] + arr[j] < (x-arr[i])){
                    si++;
                }
                else{
                    j--;
                }
            }
        }
        return false;
    }

}
