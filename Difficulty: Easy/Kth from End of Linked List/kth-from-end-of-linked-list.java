/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if(head==null) return -1;
        
        Node curr= head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(k>size){
            return -1;
        }
        curr=head;
        
        for(int i=0;i<size-k;i++){
            if(curr==null) return -1;
            curr=curr.next;
        }
        return curr.data;
        
    }
}