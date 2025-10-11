class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int target) {
        // code here
        int n=mat1.length;
        int left=0;
        int right=(n*n)-1;
        int count=0;
        while(left<n*n && right>=0){
            // 2d array to 1d array
            int r1=left/n; int c1=left%n;
            int r2=right/n; int c2=right%n;
            int sum=mat1[r1][c1]+mat2[r2][c2];
            if(sum==target){
                count++;
                left++;
                right--;
            }else if (sum<target){
                left++;
            }else{
                right--;
            }
        }
        
        return count;
    }
}