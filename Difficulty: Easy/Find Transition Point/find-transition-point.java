class Solution {
    int transitionPoint(int arr[]) {
        // code here
        if(arr[arr.length-1]==0) return -1;
        int left=0;
        int right=arr.length;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==0){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        return left;
    }
}