class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        int total = 0;

        // for weeks
        for(int i = 0; i<weeks; i++)
        {
            total = total + 28 + (7 * i);
        }

        // for days
        int start = weeks + 1;
        for (int i = 0; i<days; i++)
        {
            total = total + start + i;
        }
        return total;
    }
}