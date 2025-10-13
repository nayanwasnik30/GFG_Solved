// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int goodElement=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                goodElement++;
            }
        }
        int badElement=0; //in a given window 
        for(int i=0;i<goodElement;i++){
            if(arr[i]>k){
                badElement++;
                
            }
        }
        int minswap=badElement;
        
        int start=1;
        int end=goodElement;
        while(end<arr.length){
            if(arr[start-1]>k){
                badElement--;
            }
            if(arr[end]>k){
                badElement++;
            }
            start++;
            end++;
            minswap=Math.min(minswap,badElement);
            
        }
        
        return minswap;
    }
}
