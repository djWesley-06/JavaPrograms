import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    HashMap<Character,Integer> map = new HashMap<>();
    public int romanToInt(String s) {

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i = 0;
        int ans = 0;
        while( i<s.length()){
            int a = map.get(s.charAt(i));
            int b = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
            if(a>b) {
                ans += a;
                i++;
            }

            else {
                ans-=a;
                i++;
            }
        }
        return ans;

    }
}
