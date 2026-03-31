package p0876_middle_of_the_linked_list;

public class SolutionInitial {
    public ListNode middleNode(ListNode head) {
        int nodeAmount = 0;
        int advanceCount = 0;
        if (head == null)
            return null;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            nodeAmount++;
        }
        advanceCount = nodeAmount / 2;
        for (int i = 0; i < advanceCount; i++) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        SolutionInitial sol = new SolutionInitial();
        ListNode result = sol.middleNode(head);

        System.out.println(result.val);
    }
}
