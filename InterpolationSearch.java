public class InterpolationSearch {
    public int interpolationSearch(int[] arr, int data) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high && data >= arr[low] && data <= arr[high]) {
            int pos = low + ((data - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == data) {
                return pos;
            } else if (arr[pos] < data) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }
}

