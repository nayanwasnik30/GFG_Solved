class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                q.addLast(arr[i]);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        if(q.size()!=0){
            list.add(q.getFirst());
        }else{
            list.add(0);
        }
        
        for(int i=k;i<arr.length;i++){
            
           if(q.size()>0 && arr[i-k]==q.getFirst()){
               q.removeFirst();
           }
           if(arr[i]<0){
               q.addLast(arr[i]);
           }
           if(q.size()!=0){
               list.add(q.getFirst());
              
           }else{
                list.add(0);
           }
            
        }
        
        return list;
    }
}