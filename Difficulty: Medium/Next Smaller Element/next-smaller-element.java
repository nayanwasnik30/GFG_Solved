class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int [] temp= new int [arr.length];
        Arrays.fill(temp,-1);
        
        for(int i=0;i<arr.length;i++){
            while(stack.size()>0 && arr[stack.peek()]>arr[i]){
               int remove=stack.pop();
               temp[remove]=arr[i];
            }
            stack.push(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : temp) result.add(num);
        return result;
    }
}