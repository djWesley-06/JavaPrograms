import java.util.ArrayList;

public class FirstLastIndices {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int s=0;
        int e= nums.length-1;
        int index1=-1;
        int index2 = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target==nums[mid]) {
                index1=mid;
                e=mid-1;
            }
            else if(target<nums[mid]) e=mid-1;
            else s= mid+1;
        }
        s=0;
        e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target==nums[mid]) {
                index2=mid;
                s=mid+1;
            }
            else if(target<nums[mid]) e=mid-1;
            else s= mid+1;
        }
        return new int[]{index1,index2};
    }
}
