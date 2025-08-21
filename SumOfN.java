public class SumOfN {
    public int sumOfN(int n){
        if(n==0)
            return 0;
        return n+sumOfN(n-1);
    }
}
