// User function Template for Java

class Solution {
    // Function to find the minimum number of elements to be removed.
    public int minRemoval(int[] arr) {
        // code here
        Arrays.sort(arr);
        int min=arr.length;
        for(int i=0;i<arr.length;i++){
            int floorIdx=floor(arr,(arr[i]*2)+1);
            int temp=arr.length-(floorIdx-i+1);
            
            min=Math.min(temp,min);
        }
        
        return min;
    }
    
    public int floor(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        return right;
    }
}