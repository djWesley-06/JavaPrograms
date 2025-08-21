import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetXORSum {
    int[] nums;
    int sum;
    public int subsetXORSum(int[] nums) {

        int ans = 0;

        List<List<Integer>>subsets = new ArrayList<>();
        subsets = findSubsets2(nums);
       for(int i = 1;i<subsets.size();i++){
           ans+=findXor(subsets.get(i));
       }
        return ans;
    }
    public int subsetXORSumRec(int [] arr){
        this.nums=arr;
       findXORSum3(0,0);
        return sum;
    }
    public List<List<Integer>> findSubsets2(int[] arr){
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer>inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
   public List<List<Integer>> findSubsets(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i =0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start;j<n;j++){
                List<Integer>inter = new ArrayList<>(outer.get(j));
                inter.add(arr[i]);
                outer.add(inter);
            }
        }
        return outer;
   }
   public int findXor(List<Integer> list){
        int x = list.get(0);
        for(int i = 1;i<list.size();i++){
            x^=list.get(i);
        }
        return x;
   }

   public void findXORSum3(int i, int x){
        if(i==nums.length) {
            sum += x;
            return;
        }
       findXORSum3(i+1,x^nums[i]);
       findXORSum3(i+1,x);
   }
}
