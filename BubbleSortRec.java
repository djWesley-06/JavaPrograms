public class BubbleSortRec {

    public int[] bubbleSort(int[] arr){
        sorted(arr, arr.length);
        return arr;
    }
    public void sorted(int[] arr, int l){
        if(arr.length==1)
            return;
        int count = 0;
        for(int i =0;i<l-1;i++){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count++;
            }
        }
        if(count==0)
            return;
        sorted(arr,l-1);

    }
}
