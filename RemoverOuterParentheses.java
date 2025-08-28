import java.util.Stack;

public class RemoverOuterParentheses {
    public String removeOuterParentheses(String s) {
        char[] str = s.toCharArray();
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<str.length;i++){
            if(str[i]=='(') {
                if (!st.isEmpty()) {
                    ans.append(str[i]);
                }
                st.push(str[i]);
            }
            else {
                st.pop();
                if (!st.isEmpty()) {
                    ans.append(str[i]);
                }
            }
        }
        return ans.toString();
    }

    //optimized- not using stack
    public String removeOuterParentheses2(String s) {
        char[] str = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int balanced = 0;
        for(int i = 0;i<str.length;i++){
            if(str[i]=='('){
                if(balanced>0){
                    ans.append(str[i]);
                }
                balanced++;
            }
            else{
                balanced--;
                if(balanced>=1){
                    ans.append(str[i]);
                }
            }
        }
        return ans.toString();
    }

}
