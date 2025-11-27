class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        long ans=helper(n);
        return (int)ans;
        
    }
    
    long helper(int n){
        if(n==1){
            return 1;
        }
        
        long ans=n*helper(n-1);
        return ans;
    }
}
