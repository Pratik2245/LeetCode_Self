public class LC_3217DeleteNodesFromLinkedListPresentInArray {
    public static void main(String[] args) {

    }
//    public ListNode modifiedList(int[] nums, ListNode head) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        // Step 1: add all nums to HashSet
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        // Step 2: traverse and remove nodes
//        ListNode current = head;
//        ListNode prev = dummy;
//
//        while (current != null) {
//            if (set.contains(current.val)) {
//                prev.next = current.next; // skip node
//            } else {
//                prev = current;
//            }
//            current = current.next;
//        }
//
//        return dummy.next;
//    }
}
