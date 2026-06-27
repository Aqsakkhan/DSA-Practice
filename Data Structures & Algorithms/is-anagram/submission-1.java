class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] ele = new char[26];

        for (int i = 0; i < s.length(); i++) {
            
            ele[s.charAt(i) - 'a']++;
            ele[t.charAt(i) - 'a']--;

        }

        for (int count : ele) {

            if (count != 0) {
                return false;
            }

        }

        return true;
        
    }
}
