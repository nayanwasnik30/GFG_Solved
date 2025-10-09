// User function Template for Java

class Solution {
    long countTriplets(int n, int target, long arr[]) {
        //two pointer can be only applied on sorted array
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                long sum=arr[i]+arr[left]+arr[right];
                if (sum < target) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return count;
    }
}
