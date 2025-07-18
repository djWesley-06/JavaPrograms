import java.util.Arrays;


public class KthMissingInteger {
    public int findKthPositive(int[] arr, int k) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            int missing = arr[m]-(m+1);
            if(missing >= k)
                e=m-1;
            else s=m+1;
        }
        return s+k;
    }
}
