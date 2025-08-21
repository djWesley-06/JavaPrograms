public class GoalInterpreter {
    public String interpret(String command) {
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append('G');
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
                sb.append('o');
            if(command.charAt(i)=='a') {
                sb.append("al");
            }

        }
        return sb.toString();
    }
    public String interpret2(String command) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
       while(i<command.length()){
            if(command.charAt(i)=='G'){
                sb.append('G');
                i++;
            }
            else if(command.startsWith("()",i)) {
                sb.append('o');
                i+=2;
            }
            else if(command.startsWith("(al)",i)) {
                sb.append("al");
                i+=4;
            }

        }
        return sb.toString();
    }
}
