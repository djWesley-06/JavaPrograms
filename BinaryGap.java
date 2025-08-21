public class BinaryGap {
    public int binaryGap(int n) {
        if (n <= 2 || n % 4 == 0)
            return 0;
        int last=-1;
        int dist=0;
        String bin = Integer.toBinaryString(n);
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                if(last != -1){
                   dist = Math.max(dist, i-last);
                }
                last = i;
            }
        }
        return dist;
    }
    public int binaryGap2(int n){
        int maxdis = 0;
        int dist = 0;
        boolean flag = false;
        while(n>0){
            if((n&1)==1){
                if(flag){
                    maxdis = Math.max(maxdis,dist);
                    dist=0;
                }
                flag = true;
            }
            if(flag)
                dist++;
            n>>=1;

        }
        return maxdis;
    }
}