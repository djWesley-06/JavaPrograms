public class DecryptAlphaInt {
    public String freqAlphabets(String s) {

        int i = s.length()-1;
        StringBuffer sb = new StringBuffer();
        while(i>=0){
            if(s.charAt(i)=='#'){
                StringBuffer temp = new StringBuffer();
                temp.append(s.charAt(i-2));
                temp.append(s.charAt(i-1));
                int val = Integer.parseInt(temp.toString());
                char c = (char)(val+97-1);
                sb.append(c);

                i-=3;
            }
            else{

                int val = s.charAt(i)+'0';
                char c = (char)val;
                sb.append(c);
                i--;
            }
        }

        return sb.reverse().toString();

    }
}
