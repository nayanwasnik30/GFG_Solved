class Solution {
    int countPairs(int nums[], int target) {
        // code here
         HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)==true){
               count+=map.get(temp);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
       

        return count;
    }
}