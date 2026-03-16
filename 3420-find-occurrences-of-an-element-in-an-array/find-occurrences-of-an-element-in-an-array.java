class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) 
    {
        List<Integer> positions = new ArrayList<>();

        // Store indices where nums[i] == x
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == x) 
            {
                positions.add(i);
            }
        }

        int[] answer = new int[queries.length];

        // Process each query
        for (int i = 0; i < queries.length; i++) 
        {
            int k = queries[i];

            if (k <= positions.size()) 
            {
                answer[i] = positions.get(k - 1);
            } 
            else 
            {
                answer[i] = -1;
            }
        }

        return answer;
    }
}