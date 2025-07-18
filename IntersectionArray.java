import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length>nums2.length) {
            for (int j : nums2) {
                if (bS(nums1, j)) {
                    list.add(j);
                }
            }
        }
        else{
            for (int j : nums1) {
                if (bS(nums2, j)) {
                    list.add(j);
                }
            }

        }
        int j = 0;
        int[] res = new int[list.size()];
        for(int i : list){
          res[j++]=i;
        }
        return res;

    }
    public int[] intersection2(int[] nums1, int[] nums2){
        ArrayList<Integer>list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for(int k = 0;k<res.length;k++){
            res[k]=list.get(k);
        }
        return res;
    }
    public boolean bS(int[] arr, int t){
        if(arr.length==0)
            return false;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(t==arr[m])
                return true;
            else if(t>arr[m])
                s=m+1;
            else e=m-1;
        }
        return false;
    }
}
