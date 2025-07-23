import java.util.Arrays;

import static java.lang.Math.max;

public class LargestPerimeterInTriangle {

    //bruteforce
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
            return 0;
        int a=0,b=1,c=2;
        int p=0;

        while(c<nums.length){
            boolean first = (nums[a]+nums[b])>nums[c];
            boolean second = (nums[b]+nums[c])>nums[a];
            boolean third = (nums[a]+nums[c])>nums[b];

            if(first&&second&&third){
                int pm = nums[a]+nums[b]+nums[c];
                p = max(pm,p);

            }
            a++;
            b++;
            c++;


        }
        return p;
    }
    //optimized - we check from the ending, since largest sides will be in the end after sorting and we need largest perimeter.
    public int largestPerimeter2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
            return 0;
        for(int i = nums.length-1;i>=2;i--){
            if(nums[i]<(nums[i-1]+nums[i-2])){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}
