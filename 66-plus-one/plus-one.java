class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and work backwards
        for (int i = n - 1; i >= 0; i--) 
        {
            // If the current digit is less than 9, just increment it and return the array
            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
            // Seting the current digit to 0 if it was 9
            digits[i] = 0;
        }
        // If we reach here, it means we need to add a new digit at the beginning
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}