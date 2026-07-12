class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        char[] str = s.toCharArray();
        int maxLen = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length; right++) {
            while (set.contains(str[right])) {
                set.remove(str[left]);
                left++;
                len = right - left;
            }

            set.add(str[right]);
            len++;

            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}
