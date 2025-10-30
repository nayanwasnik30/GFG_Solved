class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        Integer arr1 [] = new Integer[arr.length];
        Arrays.fill(arr1,-1);
        
        for(int i=0;i<arr.length;i++){
            
            while(stack.size()>0 && arr[stack.peek()]<arr[i]){
                arr1[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        
        return new ArrayList<>(Arrays.asList(arr1));
    }
}