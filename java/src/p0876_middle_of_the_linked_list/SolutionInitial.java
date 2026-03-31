package p0876_middle_of_the_linked_list;

import java.util.;
public class SolutionInitial {
    public ListNode middleNode(ListNode head) {
        int nodeAmount = 1;
        int advanceCount = 0;
        if(head==null) return null;
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
            nodeAmount++;
        }
        advanceCount = nodeAmount/2;
        for (int i=0;i<advanceCount;i++){
            head = head.next;
        }
        return head;
    }
}
