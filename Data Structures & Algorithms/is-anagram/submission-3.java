class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] elements = new char[26];
        for (int i = 0; i < s.length(); i++) {
            elements[s.charAt(i) - 'a']++;
            elements[t.charAt(i) - 'a']--;
        }

        for (int count : elements) {
            if (count != 0) return false;
        }
        return true;
    }
}
