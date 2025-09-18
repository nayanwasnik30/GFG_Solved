class Solution {
    // Function to calculate factorial of a number.
    int fact=1;
    int factorial(int n) {
        // code here
        if(n==0){
            return 1;
        }
        fact=fact*n;
        factorial(n-1);
        return fact;
    }
}
