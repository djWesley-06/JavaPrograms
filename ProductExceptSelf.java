public class ProductExceptSelf {

        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int pre[] = new int[n];
            int suff[] = new int[n];
            pre[0] = 1;
            suff[n - 1] = 1;

            for(int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] * nums[i - 1];
            }
            for(int i = n - 2; i >= 0; i--) {
                suff[i] = suff[i + 1] * nums[i + 1];
            }

            int ans[] = new int[n];
            for(int i = 0; i < n; i++) {
                ans[i] = pre[i] * suff[i];
            }
            return ans;
        }

        //space optimization
    // instead of creating prefix and suffix arrays, we can do the calculation and store in result array

    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        ans[0]=1;

        for(int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        //since prefix values are already stored in ans, we can calculate suffix values in array.
        // We calculate and store it in a variable and update the ans array after calculation
        int suffix = 1;
        for(int i = n - 2; i >= 0; i--) {
            suffix *= nums[i+1];
            ans[i]*=suffix;
        }

      return ans;
    }


}
