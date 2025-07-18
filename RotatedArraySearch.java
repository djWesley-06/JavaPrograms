public class RotatedArraySearch {

    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target, 0, nums.length-1);
        }
        if(target==nums[pivot]){
            return pivot;
        }
        else if(nums[0]<=target){
            pivot = binarySearch(nums,target, 0,pivot-1);
        }
        else pivot = binarySearch(nums, target, pivot+1, nums.length-1);

        return pivot;

    }
    public int findPivot(int[] arr){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid < e && arr[mid]>arr[mid+1]) return mid;
            if(mid > s && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[s]>=arr[mid]) e = mid-1;
            else s=mid +1;
        }
        return -1;
    }
    public int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]) return mid;
            else if(target<arr[mid])end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
