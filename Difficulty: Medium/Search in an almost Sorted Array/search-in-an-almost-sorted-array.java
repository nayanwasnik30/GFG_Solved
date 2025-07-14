// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(mid>left && arr[mid-1]==target){
                return mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
            else if(mid< right && arr[mid+1]==target){
                return mid+1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
        
    }
}