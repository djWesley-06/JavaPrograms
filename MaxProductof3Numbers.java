import java.util.Arrays;

public class MaxProductof3Numbers {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        return Math.max((arr[0]*arr[1]*arr[l-1]),(arr[l-3]*arr[l-1]*arr[l-2]));

    }
}
