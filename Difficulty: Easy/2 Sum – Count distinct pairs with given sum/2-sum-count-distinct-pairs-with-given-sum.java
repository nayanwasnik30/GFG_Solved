class Solution {

    static int countDistinctPairs(int arr[], int target) {
        
        // Your code here
        Arrays.sort(arr);
        int left =0;int right=arr.length-1;
        int count=0;
        while(left<right){
            if(left>0 && arr[left-1]==arr[left]){
                left++;
                continue;
            }
            int sum=arr[left]+arr[right];
            if(sum==target){
                count++;
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
