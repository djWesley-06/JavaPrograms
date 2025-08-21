public class Print1ToN {
    public void printNos(int n) {
        helper(1,n);
    }

    private void helper(int i, int n) {
        if(i>n)
            return;
        System.out.println(i);
        helper(i+1,n);
    }
}
