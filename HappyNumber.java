public class HappyNumber {

    //We use fast and slow pointer method used in linked list for loop detection.
    //We come out when there is loop i.e, when fast = slow and check the value of slow whether it is equal to 1 or not
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do{
            slow = findSq(slow);
            fast = findSq(findSq(fast));
        }while(slow!=fast);
        if(slow==1)
            return true;
        return false;


    }
    public int findSq(int n){
        int ans =0;
        while(n>0){
            int rem = n%10;
            ans+=rem*rem;
            n/=10;

        }
        return ans;
    }
}
