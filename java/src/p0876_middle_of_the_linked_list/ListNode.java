package p0876_middle_of_the_linked_list;

public class ListNode {
    public int val;
    public ListNode next;

    // コンストラクタ（引数なし）
    public ListNode() {
    }

    // コンストラクタ（値のみ）
    public ListNode(int val) {
        this.val = val;
    }

    // コンストラクタ（値と次のノード）
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}