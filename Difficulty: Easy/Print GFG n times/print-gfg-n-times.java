class Solution {

    void printGfg(int n) {
        // code here
        
        if(n==0){
            return ;
        }
        
        printGfg(n-1);
        System.out.print("GFG ");
        
    }
}