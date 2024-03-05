class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> newstacks =new Stack<>();
        while(head!=null)
        {
            newstacks.push(head.val);
            head=head.next;    //we use the stack for this approach
        }
        ListNode newrevlist=new ListNode(Integer.MIN_VALUE);
        ListNode ptr=newrevlist;
        
        while(!newstacks.isEmpty())
        {
            ptr.next=new ListNode(newstacks.pop());
            ptr=ptr.next;
        }
  return newrevlist.next;
    }
}