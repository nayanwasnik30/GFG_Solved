class Solution {
    int countTriplet(int arr[]) {
        Arrays.sort(arr);
        int ans=0;
        for(int i=arr.length-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==arr[i]){
                    ans++;
                    left++;
                    right--;
                }else if(sum<arr[i]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return ans;
    }
}