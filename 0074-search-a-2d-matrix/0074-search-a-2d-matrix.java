class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j=matrix[0].length-1,i=0;
        while(i>=0 && i<matrix.length && j>=0)
        {
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target)
                i++;
            else
                j--;
        }
        return false;
    }
}