// User function Template for Java

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }else{
               return false;
            }
        }
        return true;
    }
}