public class CountingBits {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0]=0;
        for(int i = 1;i<arr.length;i++)
            arr[i]=count(i);
        return arr;

    }
    public int count(int n){
        int c =0;
        while(n>0){
            if((n&1) == 1)
                c++;
            n>>=1;
        }
        return c;
    }
    //OPTIMAL SOLUTION
    public int[] countBits2(int n) {
        int[] result = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {

            // int numOfones = result[i/2] + (i&1);
            result[i] = result[i/2] + (i&1);

            // int num = i;
            // while (num != 0) {
            //     numOfones += num%2;
            //     num = (num)/2;
            // }
            // result[i] = numOfones;
        }
        return result;
    }
}
