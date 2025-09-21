class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(compare(arr,j,j+1)==true){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public boolean compare(int[]arr ,int l,int r){
        if(arr[l]>arr[r]) return true;
        else if(arr[l]<arr[r]) return false;
        else return false;
    }
    public void swap(int []arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return;
    }
    
}