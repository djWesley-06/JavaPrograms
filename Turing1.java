public class Turing1 {
    public int[] turing(int[] k, int x){

        int l = k.length;
        int[] res = new int[l];

        for(int i=0;i<l;i++){
            res[i] = sum(k,x,i);
        }

        return res;
    }
    public int sum(int[] arr, int x, int index){
        int sum = 0;

        if(x>0){
            for(int j = 1;j<=x;j++) {
                sum += arr[(index + j)%arr.length];
            }
        }
        else if(x<0){
            for(int j = 1;j<=Math.abs(x);j++){
                sum +=arr[(index-j)%arr.length];
            }
        }
        else{
            return 0;
        }

        return sum;
    }
}
