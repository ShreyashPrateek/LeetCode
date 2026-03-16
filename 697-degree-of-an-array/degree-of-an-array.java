class Solution {
    public int findShortestSubArray(int[] nums) 
    {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) 
        {
            first.putIfAbsent(nums[i], i);

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            degree = Math.max(degree, count.get(nums[i]));
        }

        for (int num : count.keySet()) 
        {
            if (count.get(num) == degree) 
            {
                int length = nums.length;

                for (int i = nums.length - 1; i >= 0; i--) 
                {
                    if (nums[i] == num) 
                    {
                        length = i - first.get(num) + 1;
                        break;
                    }
                }
                minLength = Math.min(minLength, length);
            }
        }
        return minLength;
    }
}