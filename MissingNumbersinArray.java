import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class MissingNumbersinArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
        }
        System.out.println(Arrays.toString(freq));
        for(int i = 1;i<freq.length;i++){
            if(freq[i]==0)
                list.add(i);
        }
        return list;
    }
}
