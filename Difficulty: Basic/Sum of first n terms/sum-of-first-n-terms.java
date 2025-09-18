// User function Template for Java

class Solution {
    int total=0;
    int sumOfSeries(int n) {
        // code here
        if(n==0){
            return 1;
        }
        sumOfSeries(n-1);
        
        total=n+total;
        return total*total;
    }
}