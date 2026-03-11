class Solution {
    public int findLucky(int[] arr) 
    {
        int[] freq = new int[501];

        // Frequency ko count krna hai
        for (int i = 0; i < arr.length; i++) 
        {
            freq[arr[i]]++;
        }

        int result = -1;

        for(int i = 1; i <= 500; i++)
        {
            if(freq[i]==i)
            result = i;
        }
        return result;
    }
}