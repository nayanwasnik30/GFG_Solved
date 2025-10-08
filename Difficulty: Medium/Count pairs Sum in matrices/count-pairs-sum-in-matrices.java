class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int target) {
        // code here
        int n=mat1.length;
        int left=0;int right=(n*n)-1;
        int count=0;
        while(left<n*n && right>=0){
            //co-ordinate
            int row1=left/n;int col1=left%n;
            int row2=right/n;int col2=right%n;
            int sum=mat1[row1][col1]+mat2[row2][col2];
            if(sum==target){
                count++;
                left++;
                right--;
                continue;
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        
        return count;
    }
}