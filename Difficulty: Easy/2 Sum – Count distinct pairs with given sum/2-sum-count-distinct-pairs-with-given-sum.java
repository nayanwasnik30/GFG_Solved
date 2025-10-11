class Solution {

    static int countDistinctPairs(int arr[], int target) {
        // Your code here
        if(arr.length<1){
            return 0;
        }
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int count=0;
        while(left<right){
            if(left>0 && arr[left-1]==arr[left]){
                left++;
                continue;
            }
            if(arr[left]+arr[right]==target){
                count++;
                left++;
                right--;
            }else if(arr[left]+arr[right]<target){
                left++;
            }else{
                right--;
            }
        }
        
        return count;
    }
}
