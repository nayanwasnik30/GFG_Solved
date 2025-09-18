class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int []nums=new int[n];
        read(arr,n-1,nums,0);
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
    }
    
    public void read(int []arr,int n,int []nums,int idx){
        
    if(n<0){
        return;
    }
    
    nums[idx]=arr[n];
    read(arr,n-1,nums,idx+1);
    
    }
    
}