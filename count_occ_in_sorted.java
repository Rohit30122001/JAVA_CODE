public class count_occ_in_sorted {

    public static void main(String[] args) {
        int[] arr = {10,20,20,20,40,40};
        int n = arr.length;
        System.out.print(count_occ(arr,n,20));
    }
    static int count_occ(int[] arr, int n,int x){

        int first = first_Occ(arr,n,x);
        if(first == -1){
            return -0;
        }
        else{
            return (last_Occ(arr,n,x) - first + 1);
        }


    }
    static int first_Occ(int[] arr,int n,int x){
        int low = 0;
        int high = n-1,mid = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1;
    }
    static int last_Occ(int[] arr, int n, int x){
        int low = 0;
        int high = n-1,mid = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                }
                low = mid + 1;
            }
        }

        return -1;
    }
}
