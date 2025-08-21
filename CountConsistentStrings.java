public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (isConsistent(words[i], allowed))
                count++;
        }
        return count;

    }

    public boolean isConsistent(String s, String allowed) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (allowed.contains(s.charAt(i) + ""))
                flag = true;
            else return false;
        }
        return flag;
    }


    //Using Bit manipulation
    //An int has 32 bits. There are 26 alphabets. So we set the bits in allowed string to 1 in a variable
    //Each bit refers to a character in alphabetical order.
    //Then we check in the word if there is set bit for that character in our variable.

    // Explanation : https://leetcode.com/problems/count-the-number-of-consistent-strings/solutions/3188877/bit-manipulation-with-explanation/

    public int countConsistent(String allowed, String[] words) {
        int count = 0, var = 0;
        char[] all = allowed.toCharArray();
        for (char c : all) {
            var = var | (1 << c - 'a');
        }
        for (String s : words) {
            char[] w = s.toCharArray();
            int consistent = 1;
            for (char c : w) {
                if ((var & (1 << c - 'a')) == 0) {
                    consistent = 0;
                    break;
                }
            }
            count+=consistent;
        }
        return count;
    }
}
