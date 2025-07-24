import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAndDuplicate {
    public int[] findErrorNums(int[] nums) {

        int[] res = new int[2];

        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
        }
        System.out.println(Arrays.toString(freq));
        int index = 0;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                res[index] = i;
                index++;
            }
        }
        for (int j = 1; j < freq.length; j++) {
            if (freq[j] == 0) {
                res[index] = j;
                index++;
            }
        }
        return res;
    }
}
