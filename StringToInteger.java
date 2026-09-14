public class StringToInteger {
    public int myAtoi(String s) {

        StringBuilder sb = new StringBuilder();
        s = s.trim();
        for(char c : s.toCharArray()){
            if(sb.isEmpty() && c=='-') sb.append(c);
            else if(Character.isDigit(c)) sb.append(c);
            else break;
        }

        return Integer.parseInt(sb.toString());

    }
    public int myAtoi2(String s) {

        if(s==null || s.isEmpty()) return 0;
        int n = s.length();
        int i = 0;
        int MAX_INT = Integer.MAX_VALUE;
        int MIN_INT = Integer.MIN_VALUE;

        while(i<n && s.charAt(i) == ' ') i++;

        if(i==n) return 0;

        int sign = 1;
        if(s.charAt(i)=='+') i++;

        else if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        long res= 0;
        while(i<n && Character.isDigit(s.charAt(i))){

            int num = s.charAt(i)-'0';
            res = res*10+num;
            if(res*sign > MAX_INT) return MAX_INT;
            if(res*sign < MIN_INT)return MIN_INT;
            i++;

        }
        return (int)res*sign;
    }
}
