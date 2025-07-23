import java.util.Arrays;

public class ArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean flag = false;
        if(arr.length<=2)
            return true;
        for(int i=2;i<arr.length;i++){
            if((arr[i-2]-arr[i-1]) == (arr[i-1]-arr[i])) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
