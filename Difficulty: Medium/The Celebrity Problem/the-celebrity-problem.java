class Solution {
    public int celebrity(int M[][]) {
        // code here
        int n=M.length;
        Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<n;i++){
    	    stack.add(i);
    	}
    	while(stack.size() > 1){
    	    int p1=stack.pop();
    	    int p2=stack.pop();
    	    
    	    if(M[p1][p2]==1){// p1 knows p2 means p1 is not a celeb
    	        stack.push(p2);
    	    }
    	    else{
    	        stack.push(p1);
    	    }
    	}
    	
    	int pceleb = stack.pop();

        // Check row (celebrity knows nobody except possibly themselves)
        for (int i = 0; i < n; i++) {
            if (i != pceleb && M[pceleb][i] == 1) {
                return -1;
            }
        }

        // Check column (everyone knows celebrity)
        for (int i = 0; i < n; i++) {
            if (i != pceleb && M[i][pceleb] == 0) {
                return -1;
            }
        }

        return pceleb;
    }
}