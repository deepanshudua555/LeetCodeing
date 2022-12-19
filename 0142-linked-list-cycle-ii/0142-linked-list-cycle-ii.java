/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode slo = head;
        ListNode fst= head;
        
        while(fst!=null && fst.next!=null){
            fst= fst.next.next;
            slo = slo.next;
            if(slo==fst)break;
        }
        if(slo!=fst)return null;
        
        slo = head;
        fst = fst;
        while(slo!=fst){
            slo=slo.next;
            fst = fst.next;
        }
        return slo;
    }
}