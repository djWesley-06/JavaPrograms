import java.util.Arrays;

public class MissingNumber {
    //using count sort
    public int missingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else i++;

        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }
        }
        return arr.length;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //method 2
    public int missingNumber2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return arr.length;
    }

    //method 3 - using formula
    public int missingNumber3(int[] nums){
            int n=nums.length;
            int original = n*(n+1)/2;
            int sum=0;
            for(int num : nums){
                sum += num;
            }
            return original-sum;
        }
}
