public class ReverseWords {

    public String reverseWords(String s) {

        String[] strs = s.split((" "));
        StringBuilder res = new StringBuilder();
        for(int i = strs.length - 1;i>=0;i--){
            if(!strs[i].isEmpty()){
                res.append(strs[i].trim()).append(" ");
            }
        }

        return res.toString().strip();
    }
}
