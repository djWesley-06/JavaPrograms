public class RotateString {
    public boolean rotateString(String s, String goal) {

        int start = 0;
        for(int i = 0;i<goal.length();i++){
            if(goal.charAt(i) == s.charAt(0)) start = i;
        }
        for(int i=0,j = start;i<s.length()&&j<s.length();i++,j++){
            if(s.charAt(i) != goal.charAt(j%s.length())) return false;
        }
        return true;

    }
}
