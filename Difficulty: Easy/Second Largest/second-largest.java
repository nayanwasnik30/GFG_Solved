class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int temp=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                temp=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
    }
}
