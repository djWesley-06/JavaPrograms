import java.util.Stack;

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        char[] m = moves.toCharArray();
        int u=0;
        int r=0;
        for(char c: m){

            if(c=='U')
                u++;
            else if(c=='D')
                u--;
            else if(c=='R')
                r++;
            else if(c=='L')
                r--;

        }
       return(u==0 && r==0);

    }
}
