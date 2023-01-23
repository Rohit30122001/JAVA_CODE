public class last_occ_index {
    public static void main(String[] args) {
        int[] arr = {5,10,10,20,20};
        int n = arr.length;
        System.out.println(last_Occ(arr,n,10));
    }
    static int last_Occ(int[] arr, int n, int x){
        int low = 0;
        int high = n-1,mid = 0;
        while(low <= high){
            mid = (low + high) / 2;
            if(arr[mid] > x){
                high = mid-1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                if(mid == n-1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }
                 low = mid + 1;
            }
        }
        return mid;
    }
    }

