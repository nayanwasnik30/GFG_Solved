// User function Template for Java
class Solution {
    char firstRep(String str) {
        // your code here
        str=str.toLowerCase();
        int [] arr= new int [26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(arr[ch-'a']>1){
                return ch;
            }
        }

        return '#';
    }
}