public class ReduceSteps {
    public int numberOfSteps(int num) {

        return helper(num, 0);
    }
    public int helper(int n, int c){
        if(n==0)
            return c;
        if(n%2==0)
            return helper(n/2,c+1);
        if(n%2==1)
            return helper(n-1,c+1);
        return c;
    }

    //Using Bit Manipulation
    public int numberOfSteps2(int num){
        if(num==0)
            return 0;
        int steps = 0;
        while(num>0){
            steps+=((num&1)==1)?2:0;
            num>>=1;
        }
        return steps -1;
    }
}
