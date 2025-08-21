public class RemoveConsecutiveDuplicates {
    public String removeDuplicates(String str){
        if(str.length()<=1)
            return str;
        if(str.charAt(0)==str.charAt(1))
            return removeDuplicates(str.substring(1));
        return str.charAt(0)+removeDuplicates(str.substring(1));
    }
    public String removeAllDuplicates(String str){
        if(str.length()<=1)
            return str;
        String op = "";
        return helper(str,op,1);
    }

    //under development
    public String helper(String str, String op,int index){
        if(str.isEmpty()){
            return op;
        }
        if(op.isEmpty())
            op+=str.charAt(0);
        for(int i = 0;i<op.length();i++){
            if(op.charAt(i)!=str.charAt(0))
                op = helper(str.substring(1),op+str.charAt(0),index+1);
            else op = helper(str.substring(1),op,index+1);
        }
        return helper(str.substring(1),op+str.charAt(0),index+1);
    }
}
