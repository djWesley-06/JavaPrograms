public class BinarySearchRec {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int index = bS(nums,0,nums.length-1,target);
        return index;
    }
    public int bS(int[] arr,int start, int end, int target){
        if(start>end)
            return -1;
        int m = start+(end-start)/2;
        if(target == arr[m])
            return m;
        if(target<arr[m]){
            return bS(arr,start,m-1,target);
        }
        else return bS(arr,m+1,end,target);
    }
}
