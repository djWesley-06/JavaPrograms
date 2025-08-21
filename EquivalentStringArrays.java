public class EquivalentStringArrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean flag = false;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(String i : word1){
            sb1.append(i);
        }
        for(String j : word2){
            sb2.append(j);
        }

        return sb1.toString().equals(sb2.toString());
//        return flag;

    }
}
