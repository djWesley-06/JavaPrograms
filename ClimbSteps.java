public class ClimbSteps {
    public int climbStairs(int n) {


        return helper(n,0);

    }
    public int helper(int n , int s){
        if(n<=3)
            return n;
        int one = helper(n-1,s+1);
        int two = helper(n-2,s+1);
        return one+two;

    }

    //iterative

    public int climbSteps(int n){
        if(n<=3)
            return n;
        int curr = 0;
        int a = 3;
        int b = 2;
        for(int i = 3;i<n;i++){

            curr = a+b;
            b=a;
            a=curr;
        }
        return curr;
    }
}
