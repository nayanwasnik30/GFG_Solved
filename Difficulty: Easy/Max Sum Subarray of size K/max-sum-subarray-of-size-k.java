class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        //sliding window
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        int max=curr;//so i can change my currsum and compare with maxsum
        for(int i=k;i<arr.length;i++){
            curr=curr+arr[i];
            curr=curr-arr[i-k];
            max=Math.max(curr,max);
        }
        
        
        return max;
    }
}