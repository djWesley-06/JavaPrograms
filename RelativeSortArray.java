import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Arrays.stream(arr1).max().getAsInt();
        int[] freq = new int[max+1];
        for(int i : arr1){
            freq[i]++;
        }
        int[] res = new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++){
            while(freq[arr2[i]]>0){
                res[index]=arr2[i];
                index++;
                freq[arr2[i]]--;
            }
        }
        for(int i=0;i<=max;i++){
            while(freq[i]>0){
                res[index]=i;
                index++;
                freq[i]--;
            }
        }

        return res;
    }
}
