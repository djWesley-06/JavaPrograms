public class BinaryAddition {
    public String addBinary(String a, String b) {


        int i = toDec(a);
        int j = toDec(b);


        return Integer.toBinaryString(i+j);
    }

    private String binsum(int i) {

        int ans = 0;
        int base = 1;
        while(i>0){
          int last = i%2;
          i=i/2;
          ans+=last*base;
          base*=2;

        }
        return String.valueOf(ans);
    }
    private int toDec(String s){
        int n = Integer.parseInt(s);
        int ans = 0;
        int base = 1;
        while(n>0){
            int last = n%10;
            n=n/10;
            ans+=last*base;
            base*=2;
        }
        return ans;
    }

    public String addBinary2(String a , String b){
        StringBuffer res = new StringBuffer();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0||j>=0){
            int sum = carry;
            if(i>=0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum>1?1:0; // or carry = sum/2 :- decreases run time.
            res.append(sum%2);

        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
