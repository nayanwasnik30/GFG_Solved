class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
    
        list.add(map.size());
        for(int i=k;i<arr.length;i++){
            int include=arr[i];
            int exclude=arr[i-k];//-- 0 idx element 
            
            if(map.containsKey(exclude)){
                map.put(exclude,map.getOrDefault(exclude,0)-1);    
                if(map.get(exclude)==0){
                    map.remove(exclude);
                }
            }
            
            map.put(include,map.getOrDefault(include,0)+1);//include 
            list.add(map.size());
        }
        
        return list;
    }
}