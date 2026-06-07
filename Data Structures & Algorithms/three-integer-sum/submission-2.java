class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);

        List <List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < ( n - 2 ); i++) {
            if (i > 0 && nums[i] == nums [i - 1]) {
                continue;
            }

            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                long sum = (long) nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }

                    start++;
                    end--;
                    
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        } 
        return result;
    }
}
