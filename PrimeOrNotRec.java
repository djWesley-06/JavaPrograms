public class PrimeOrNotRec {
    public boolean isPrime(int n){
        if(n<=2){
            return n==2;
        }
        int i=2;
        return helper(n,i);
    }
    public boolean helper(int n, int i){
        if(n%i==0)
            return false;
        if(i*i>n){
            return true;
        }
        return helper(n,i+1);
    }
}
