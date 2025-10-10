class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        // code here
        int ans=0;
        int n=nums.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(n<4){
            return list;
        }
        Arrays.sort(nums);
        for(int i=n-1;i>=3;i--){
            if (i < n - 1 && nums[i] == nums[i + 1]) continue;
            for(int j=i-1;j>=2;j--){
                if (j < i - 1 && nums[j] == nums[j + 1]) continue;
                int left=0;
                int right=j-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        ArrayList<Integer> quad = new ArrayList<>(Arrays.asList(nums[left], nums[right], nums[i], nums[j]));
                        Collections.sort(quad);
                        list.add(quad);
                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while(nums[right]==nums[right-1] && left<right){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        //Arrays.sort(list);
         Collections.sort(list, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        return list;
    }
}