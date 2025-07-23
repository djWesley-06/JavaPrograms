import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int newmin = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            newmin = Math.abs(arr[i+1]-arr[i]);
            if(newmin<min)
                min=newmin;
        }

        for(int i =0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == min){
                List<Integer>ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i+1]);
                System.out.println(ans);
                res.add(ans);
                System.out.println(res);
            }

        }
        return res;

    }
}
