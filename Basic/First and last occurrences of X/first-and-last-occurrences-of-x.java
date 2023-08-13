//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int target){
        // Code here
        int si =0;
        int ei=n-1;
        int first=-1;
        int last=-1;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(si<=ei){
            int mid =si+(ei-si)/2;
            if(arr[mid]==target){
                first=mid;
                ei=mid-1;
            }
            else if(arr[mid]<target){
               si=mid+1;
            }else{
                ei=mid-1;
            }
            
        }
        si=0;
        ei=n-1;
          while(si<=ei){
            int mid =si+(ei-si)/2;
            if(arr[mid]==target){
                last=mid;
                si=mid+1;
            }
            else if(arr[mid]>target){
                ei=mid-1;
            }else{
                si=mid+1;
            }
            
        }
        if(first== -1 && last == -1) {
            list.add(-1);
        } else {
            list.add(first);
            list.add(last); 
        }
        
        
        return list;
    }
}
