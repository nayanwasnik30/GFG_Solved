class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashMap<Integer,Boolean> map=new HashMap<>();
        
        for(int num:a){
            map.put(num,true);
        }
         for(int num:b){
            map.put(num,true);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        return list;
    }
}
