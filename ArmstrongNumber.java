public class ArmstrongNumber {
    public boolean armstrongNumber(int n) {

        int num = n;

        if(n<=1)
            return true;

        int ans = 0;
        // code here
        while(num!=0){

            int rem = num%10;
            ans+=rem*rem*rem;
            num/=10;

        }
        return ans==n;
    }
}
