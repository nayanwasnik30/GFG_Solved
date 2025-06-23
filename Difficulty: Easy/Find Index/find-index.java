// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int first=first(arr,key,0);
        int last=last(arr,key,arr.length-1);
        return new int []{first,last};
    }
    public static int first(int[] arr,int t,int idx){
        if(idx>=arr.length){
            return -1;
        }
        if(arr[idx]==t){
            return idx;
        }
        return first(arr,t,idx+1);
        
    }
    public static int last(int []arr,int t,int idx){
        if(idx<0){
            return -1;
        }
        if(arr[idx]==t){
            return idx;
        }
        
        return last(arr,t,idx-1);
        
    }
    
}