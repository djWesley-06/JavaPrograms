import java.util.Arrays;
import java.util.HashSet;

public class CheckForDouble {
    public boolean checkIfExist(int[] arr) {
        boolean flag = false;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){

             if(bs(arr, i+1,arr.length-1, 2*arr[i]))
                flag = true;
             else if(bs(arr, i+1,arr.length-1, (int)arr[i]/2))
                 flag = true;
        }

        return flag;

    }
    public boolean bs(int[] arr,int start, int end, int t){
        if(arr.length==0)
            return (t==0);
        int s=start;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(t==arr[m]){
                    return true;
            }

            else if(t<arr[m])
                e=m-1;
            else s=m+1;
        }
        return false;
    }
    public boolean checkIfExistSet(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for(int num : arr){
            if(s.contains(2*num) || (num%2 == 0&&s.contains(num/2))){
                return true;
            }
            s.add(num);
        }
        return false;
    }
}
