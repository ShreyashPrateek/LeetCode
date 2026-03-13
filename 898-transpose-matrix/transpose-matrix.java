class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        // Number of rows in the original matrix
        int rows = matrix.length;

        // Number of columns in the original matrix
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        // Loop through every element of the original matrix
        for(int i=0; i<rows; i++)
        {
            for(int j=0 ; j<cols; j++)
            {
                // Swap row and column index
                result[j][i] = matrix[i][j];
            } 
        }  
        return result;  
    }
}