public class ExcelColumnToString {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int n = columnNumber%26;
            columnNumber/=26;
            sb.append((char)(n +'A'));
        }
        return sb.reverse().toString();

    }
}
