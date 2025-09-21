class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(compare(arr,j,min)==true){
                   min=j; 
                }
            }
            swap(arr,i,min);
        }
        
    }
    public boolean compare(int[]arr ,int l,int r){
        if(arr[l]>arr[r]) return false;
        else if(arr[l]<arr[r]) return true;
        else return false;
    }
    public void swap(int []arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return;
    }
}