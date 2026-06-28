class Solution {
    public int lengthOfLastWord(String s) {

        int len = 0;
        String str = s.trim();
        int n = str.length();

        for (int i = n - 1; i > 0; i--) {

            if (str.charAt(i) == ' ') {
                return len;
            }

            len++;
        }

        return str.length();
        
    }
}