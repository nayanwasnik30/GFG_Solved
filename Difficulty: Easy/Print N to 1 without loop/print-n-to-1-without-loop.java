class Solution {

    void printNos(int n) {
        // code here
        if(n>0){
            System.out.print(n+" ");
        }else{
            return ;
        }
        
        printNos(n-1);
        
    }
}