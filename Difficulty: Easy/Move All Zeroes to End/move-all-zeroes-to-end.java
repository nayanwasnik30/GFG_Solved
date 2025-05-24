// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
         int []temp= new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}