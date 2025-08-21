public class AlternatingBits {
    public boolean hasAlternatingBits(int n) {
        boolean flag = false;
        if(n<=2)
            return true;
        String binary = Integer.toBinaryString(n);
        for(int i = 1;i<binary.length()-1;i++){
            if((binary.charAt(i-1)!= binary.charAt(i)) &&(binary.charAt(i)!=binary.charAt(i+1))){
                flag = true;
            }
           else return false;

        }
        return flag;
    }
}
