import java.util.Arrays;

public class SpecialArray {
    public int specialArray(int[] nums) {

        int s=0;
        int e= nums.length-1;
        while(s<e){
            int m = s+(e-s)/2;
            int t = count(nums, m);
            if(t==m) return m;
            else if(t<m) e=m-1;
            else s=m+1;
        }
        return -1;
    }
    public int count(int[] arr , int x){
        int count = 0;
        for(int i : arr){
            if(i>=x)
                count++;
        }
        return count;
    }
}
