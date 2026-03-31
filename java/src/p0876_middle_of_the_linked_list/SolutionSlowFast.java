package p0876_middle_of_the_linked_list;

/**
 * 876. Middle of the Linked List
 * 階層: Easy
 * 解法: Slow & Fast Pointers (Two Pointers)
 */
public class SolutionSlowFast {
    public ListNode middleNode(ListNode head) {
        // ガード節: headがnullの場合はそのまま返す
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        // fastが2歩進める間、slowを1歩進める
        // fast.next != null のチェックにより、fast.next.next でのNPEを防ぐ
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // fastが終端に達したとき、slowは中央に位置する
        return slow;
    }

    public static void main(String[] args) {
        // リスト作成: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        SolutionSlowFast sol = new SolutionSlowFast();
        ListNode result = sol.middleNode(head);

        // 期待値: 3
        System.out.println("Middle Node Value: " + result.val);
    }
}