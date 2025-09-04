import java.util.Arrays;

public class SumTriangleArray {
    public void printSum(int[] arr){
        if(arr.length<1){
            return;
        }

        int[] sums = new int[arr.length-1];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            sums[index]=arr[i]+arr[i+1];
            index++;
        }

        printSum(sums);
        System.out.println(Arrays.toString(arr));


    }
}
