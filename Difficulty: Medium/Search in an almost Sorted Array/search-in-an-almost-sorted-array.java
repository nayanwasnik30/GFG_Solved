// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            if(mid>left && arr[mid-1]==target){
                return mid-1;
            }
            if(mid<right && arr[mid+1]==target){
                return mid+1;
            }
            if(arr[mid]<target){
                left=mid+2;
            }else{
                right=mid-2;
            }
        }
        
        return -1;
    }
}