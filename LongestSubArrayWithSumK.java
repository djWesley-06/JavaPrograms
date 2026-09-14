public class LongestSubArrayWithSumK {
    public int longestSubarray(int[] nums, int k) {
        int max = 0, sum = 0, i = 0;
        int n = nums.length;
        while(i<n){
            sum+=nums[i];
            int j = i+1;
            while(j<n){
                sum+=nums[j];
                if(sum == k){
                    int currLen = j-i+1;
                    max = Math.max(currLen,max);
                    sum = 0;
                    break;
                }
                else if(sum>k){j++; sum = 0; break;}
                else j++;
            }
            i++;

        }
        return max;
    }
}
