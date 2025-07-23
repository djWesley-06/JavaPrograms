import java.util.Arrays;

public class ThirdDistinctMax {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int prev = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            if(prev!=arr[i]){
                count++;
                prev = arr[i];
            }
            if(count ==3){
                return prev;
            }
        }
        return arr[arr.length-1];
    }
}
