public class PalindromesInString {

    public void findAllPalins(String s){
        String temp = null;
        int index = 0;
        for(int i =0;i<s.length();i++){
            temp=s.charAt(i)+"";
            System.out.println(temp);
            for(int j = i+1;j<s.length();j++){
                temp+=s.charAt(j);
                if (isPalin(temp)){
                    System.out.println(temp);
                }
            }
            temp = null;

        }
    }
    public boolean isPalin(String s){
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        return s1.equals(s);
    }
}
