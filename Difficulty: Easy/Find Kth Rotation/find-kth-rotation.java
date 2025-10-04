class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int left=0;
        int right=arr.length-1;
        if(arr[left]<=arr[right]){
            return 0;
        }
        
         while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=arr[0]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        return left;
        
    }
}