public class StringReverse3 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(String str : arr){
            StringBuffer temp = new StringBuffer(str);
            temp.reverse();
            sb.append(temp);
            sb.append(" ");
        }
        String ret = sb.toString();
        return ret.trim();
    }
}
