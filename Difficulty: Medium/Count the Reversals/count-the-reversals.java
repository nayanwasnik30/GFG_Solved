class Solution {
    public int countMinReversals(String s) {
        // code here
        int open=0; int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'){
                open++;
            }else if(ch=='}'){
                if(open>0){
                    open--;
                }
                else{
                    close++;
                }
            }
        }
        //System.out.print(open+close);
        int sum=open+close;
        if(sum%2==1) return -1;
        if(open%2==1) return (sum/2)+1;
        return sum/2;
        
        
    }
}