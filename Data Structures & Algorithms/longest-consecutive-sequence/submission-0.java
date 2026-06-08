class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {

            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLen = 1;

                while (set.contains(currentNum + 1)) {

                    currentNum++;
                    currentLen++;

                }

                longest = Math.max(longest, currentLen);
            }
        }

        return longest;

    }
}
