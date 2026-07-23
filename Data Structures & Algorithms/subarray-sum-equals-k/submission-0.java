class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int[] prefSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefSum[i + 1] = prefSum[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int sum : prefSum) {
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return count;
        
    }
}