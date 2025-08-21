import java.util.*;

public class LongestNiceSubString {
    List<String> subs = new ArrayList<>();
    public String longestNiceSubstring(String s) {
        String ans = "";
        char[] str = s.toCharArray();

        for(int i =0;i<s.length();i++){
            int lower=0;
            int upper=0;
            for(int j = i;j<s.length();j++){
                if(Character.isLowerCase(str[j]))
                    lower |= (1<<str[j]-'a');
                else upper |= (1<<str[j]-'A');

                if(lower==upper && ((j-i+1)>ans.length()))
                    ans = s.substring(i,j+1);
            }

        }
        return ans;
    }

    public String niceString(String s){
        if(s.length()<2)
            return "";
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
            set.add(c);
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (set.contains(Character.toLowerCase(ch)) && set.contains(Character.toUpperCase(ch)))
                continue;

            String left = niceString(s.substring(0,i));
            String right = niceString(s.substring(i + 1));
            return (left.length() >= right.length()) ? left : right;
        }
        return s;
    }
}
