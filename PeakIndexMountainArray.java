public class PeakIndexMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(arr[m]>arr[m+1])
                e=m;
            else s=m+1;
        }
        return s;
    }
}
