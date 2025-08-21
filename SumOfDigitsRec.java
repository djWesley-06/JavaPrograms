public class SumOfDigitsRec {
    public int sumRec(int n){
        if(n==0)
            return 0;
        return (n%10)+sumRec(n/10);
    }
}
