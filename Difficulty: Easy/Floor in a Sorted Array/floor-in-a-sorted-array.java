class Solution {
    public int findFloor(int[] arr, int target) {
        // code here
        int left=0;int right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=target){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        return ans;
    }
}
