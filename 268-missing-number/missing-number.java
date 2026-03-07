class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int k=0;k<=nums.length;k++)
        {
            sum1+=k;
        }
        for(int k=0;k<nums.length;k++)
        {
            sum2+=nums[k];
        }
        return sum1 - sum2;
    }
}