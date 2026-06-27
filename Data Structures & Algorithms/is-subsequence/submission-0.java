class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) return true;
        if (s.length() > t.length()) return false;

        int lastOcur = -1;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;

            for (int j = lastOcur + 1; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    lastOcur = j;
                    break;
                }
            }

            if (!found) return false;

        }
 
        return true;
    }
}