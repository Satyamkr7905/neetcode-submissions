class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            int needed = currentSum - k;

            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            map.put(currentSum,
                    map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
