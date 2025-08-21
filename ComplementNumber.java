import java.util.Arrays;

public class ComplementNumber {
    public int findComplement(int num) {
        String num1 = Integer.toBinaryString(num);
        StringBuffer sb = new StringBuffer(num1);
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i)=='0')
                sb.setCharAt(i,'1');
            else sb.setCharAt(i,'0');
        }
        int ans = Integer.parseInt(sb.toString(),2);
        return ans;

    }
    // or we can create a mask with all 1s and xor with binary of number to get the complement
    public int findComplement2(int x){
        int mask = (Integer.highestOneBit(x)<<1)-1;
        return x^mask;
    }
}
