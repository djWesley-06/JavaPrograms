import java.util.*;

public class SortByBits {
    public int[] sortByBits(int[] arr) {
        List<BitCount>list = new ArrayList<>();
        for (int num : arr) {
            int count = 0;
            int n = num;
            while (n != 0) {
                count++;
                n = n & (n - 1);
            }
            list.add(new BitCount(num, count));
        }


        Collections.sort(list);
        int[] result = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).value;
        }

        return result;
    }
}
