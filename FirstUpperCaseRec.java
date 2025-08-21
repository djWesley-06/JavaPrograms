import static java.lang.Character.isUpperCase;

public class FirstUpperCaseRec {

    public char firstUpper(String str){
        if(str.isEmpty())
            return '0';
        char[] c = str.toCharArray();
        char ch = helper(c, 0);
        return ch;
    }
    public char  helper(char[] arr, int start){
        if(arr.length==0)
            return'0';
        if(start>=arr.length){
            return '0';
        }
//        if((int)arr[start]>64 && (int)arr[start]<90)
//            return arr[start];
        if(isUpperCase(arr[start])){
            return arr[start];
        }
        else return helper(arr,start+1);
    }
}
