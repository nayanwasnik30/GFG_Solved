// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
       ans = new ArrayList<>(); 
       helper(s,0,"");
       Collections.sort(ans);
       return ans;
    }
    
    List<String> ans ;
    public void helper(String s,int idx,String str){
        if(idx==s.length()){
            if(str.length()==0) return;
            ans.add(""+str);
            return ;
        }
        
        char ch=s.charAt(idx);
        helper(s,idx+1,str+ch);
        //
        helper(s,idx+1,str);
    }
    
}