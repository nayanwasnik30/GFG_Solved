class Solution {
    boolean isPalindrome(String s) {
        // code here
        int n=s.length();
        boolean ans= check(s,n-1,0);
        return ans;
    }
    
    boolean check(String s,int n,int idx){
        if(idx>=n){
            return true;
        }
        
        char ch=s.charAt(n);
        char ch1=s.charAt(idx);
        if(ch != ch1){
            return false;
        }
        return check(s,n-1,idx+1);
    }
    
}