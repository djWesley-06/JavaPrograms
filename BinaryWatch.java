import java.util.ArrayList;
import java.util.List;



public class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
            List<String> ans = new ArrayList<>();
            for(int h=0;h<12;h++){
                for(int m=0;m<60;m++){
                    int hSetBits = Integer.bitCount(h);
                    int mSetBits = Integer.bitCount(m);
                    if(hSetBits+mSetBits==turnedOn){
                        ans.add(h+":"+(m < 10 ? "0" : "") + m);
                    }
                }
            }
            return ans;
    }
}
