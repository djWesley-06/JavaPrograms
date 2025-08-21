import java.util.Arrays;

public class MaxMinRecursion {

    static int getMinRec(int[] arr, int n) {

        // Base case: only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find min in rest of the array
        int minInRest = getMinRec(arr, n - 1);

        // Return the smaller value between
        // last element and recursive min
        if (arr[n - 1] < minInRest) {
            return arr[n - 1];
        } else {
            return minInRest;
        }
    }

}
