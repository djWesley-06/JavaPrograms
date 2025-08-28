import java.util.ArrayList;
import java.util.Stack;

public class RemoveAdjDup {

    ArrayList<Integer> list = new ArrayList<>();

    public String removeDuplicates(String s) {


        char[] str = s.toCharArray();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else
                st.push(c);

        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}
