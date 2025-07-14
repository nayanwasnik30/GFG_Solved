// User function Template for Java

class Solution {
    // Function to find the minimum number of elements to be removed.
    public int minRemoval(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int num=2*arr[i]+1;
            int idx=floor(arr,num);
            int trem=n-(idx-i+1);
            min=Math.min(min,trem);
        }
        return min;
        
    }
    public int floor(int [] arr,int target){
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