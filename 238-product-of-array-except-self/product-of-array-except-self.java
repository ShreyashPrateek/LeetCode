class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int [] answer = new int[nums.length];

        // left side ka products
        answer[0] = 1; // First element ka koi left nahi hai so 1
        for (int i = 1; i < nums.length; i++) 
        {
            // answer[i-1] = product of elements before (i-1)
            // multiply with nums[i-1] to get product before i
            answer[i] = answer[i - 1] * nums[i - 1];

            // Now answer[] contains left products
        }

        // right side ka products
        int right = 1;  // Stores product of elements to the right
        for (int i = nums.length - 1; i >= 0; i--) // right to left traverse
        {
            // Multiply left product (already in answer[i])
            // with right product to get final result
            answer[i] = answer[i] * right; 

            // Update right product:
            // include current element for next iteration
            right = right * nums[i]; 
        }  
        return answer;
    }
}