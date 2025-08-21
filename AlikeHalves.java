import java.util.Arrays;

public class AlikeHalves {
    public boolean halvesAreAlike(String s) {
        char[] org = s.toCharArray();
        char[] first = Arrays.copyOfRange(org,0,(org.length/2));
        char[] second = Arrays.copyOfRange(org, org.length/2,org.length);
        int v1 = countVowels(first);
        int v2 = countVowels(second);
        return v1==v2;

    }
    int countVowels(char[] arr){
        int count = 0;
        for(char c:arr){
            if(c == 'a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
                count++;
        }
        return count;
    }
}
