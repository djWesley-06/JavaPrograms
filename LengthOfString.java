public class LengthOfString {
    public int lengthStr(String str){
        if(str.equals(" ")||str.isEmpty()){
            return 0;
        }
        return lengthStr(str.substring(1))+1;
    }
}
