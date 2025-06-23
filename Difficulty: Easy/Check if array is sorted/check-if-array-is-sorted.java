class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
       int ans= helper(arr,0);
      // System.out.print(ans);
       if(ans==1){
           return true;
       }
       return false;
        
    }
    public static int helper(int [] arr,int idx){
        if(idx==arr.length-1){
          return 1  ;
        }
        if(arr[idx]<=arr[idx+1]){
           return helper(arr,idx+1);
        }
        return 0;
    }
}