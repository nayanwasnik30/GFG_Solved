// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        // total elements less than K
        int less=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                less++;
            }
        }
        int morethank=0;
        for(int i=0;i<less;i++){
            if(arr[i]>k){
                morethank++;
            }
        }
        
        int min=morethank;
        int j=less;
        for(int i=0;i<arr.length-less;i++){
            if(arr[i]>k ){
                morethank--;
            }
            if(arr[j]>k){
                morethank++;
            }
            j++;
            min=Math.min(morethank,min);
        }
        
        return min;
    }
}
