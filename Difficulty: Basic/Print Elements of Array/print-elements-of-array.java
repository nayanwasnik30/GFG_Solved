// User function Template for Java

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        helper(arr,arr.length-1);
    }
    
    void helper(int arr[],int n){
        if(n==0) {
            System.out.print(arr[0]+" ");
            return;
        }
       helper(arr,n-1);
       
       System.out.print(arr[n]+" ");
    }
    
    
}