public class SortSentence {
    public String sortSentence(String s) {
        String[] arr= s.split(" ");
        StringBuffer sb = new StringBuffer();

            for (int i = 1; i < 10; i++) {
                for(int j=0;j<arr.length;j++) {
                    if (arr[j].endsWith(String.valueOf(i))) {
                        sb.append(arr[j].substring(0, arr[j].length() - 1));
                        sb.append(" ");
                    }
                }
            }
            String str = sb.toString();
            str = str.trim();

        return str;
    }
}
