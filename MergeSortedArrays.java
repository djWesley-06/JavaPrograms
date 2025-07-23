import java.util.Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] mix = new int[nums1.length+nums2.length];
        int i = 0,j=0,k=0;
        while(i<m&&j<n){

            if(nums1[i]<nums2[j]){
                mix[k]=nums1[i];
                i++;
            }
            else {
                mix[k] = nums2[j];
                j++;
            }
            k++;

        }
        while(i<m){
            mix[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            mix[k]=nums2[j];
            j++;
            k++;
        }

        nums1 = Arrays.copyOf(mix,m+n);
        System.out.println(Arrays.toString(nums1));
    }

    public void mergeSorted2(int[] nums1,int m, int[] nums2,int n){
        for(int i=0;i<nums2.length;i++){

            nums1[m+i]=nums2[i];

        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
