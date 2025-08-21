public class IsSortedAscRec {

    public boolean isSortedAsc(int[] arr){
        return helper(arr,arr.length);
    }
    public boolean helper(int[] arr, int n){
        if(n==0|| n==1)
            return true;
        return arr[n-1]>=arr[n-2] && helper(arr,n-1);
    }
}
