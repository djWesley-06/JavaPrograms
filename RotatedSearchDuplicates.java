public class RotatedSearchDuplicates {
    public boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);
        if(pivot ==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target==nums[pivot]){
            return true;
        }
        else if(nums[0]<=target){
            return binarySearch(nums, target,0,pivot-1);
        }
        else return binarySearch(nums,target,pivot+1,nums.length-1);

    }
    public boolean binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]) return true;
            else if(target < arr[mid]) end=mid-1;
            else start = mid+1;
        }
        return false;
    }
    public int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1])return mid;
            if (mid>s && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]==arr[s] && arr[mid]==arr[e]){
                if(s<e && arr[s]>arr[s+1]) return s;
                s++;
                if(e>s && arr[e]<arr[e-1]) return e-1;
                e--;
            }
            else if(arr[s]<=arr[mid]&&arr[mid]>arr[e]){
                s=mid+1;
            }
            else e = mid-1;
        }
        return -1;
    }
}
