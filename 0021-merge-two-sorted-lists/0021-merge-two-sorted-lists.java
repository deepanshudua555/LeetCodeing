/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fh = null;
        ListNode ft = null;
        if(l1==null)return l2;
        if(l2==null)return l1;
        while(l1!=null && l2!=null){
            if(fh==null && ft==null){
                if(l1.val>l2.val){
                    fh=l2;
                    ft=l2;
                    l2 = l2.next;
                }
                else{
                    fh=l1;
                    ft=l1;
                    l1 = l1.next;
                }
            }
            if(l2!=null && l1!=null && l1.val<l2.val ){
                ft.next = l1;
                ft = ft.next;
                l1 = l1.next;
            }
            else{
                if(l2!=null && l1!=null){
                 
                    ft.next = l2;
                    ft = ft.next;
                    l2 = l2.next;   
                }
            }
        }
        
        if(l1!=null){
            ft.next = l1;
        }
        if(l2!=null){
            ft.next = l2;
        }
        return fh;
    }
}