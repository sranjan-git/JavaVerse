class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntersection {

    // Function to find the length of a linked list
    static int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // Function to find the merge point of two linked lists
    static ListNode findIntersection(ListNode head1, ListNode head2) {
        int length1 = getLength(head1);
        int length2 = getLength(head2);

        int lengthDiff = Math.abs(length1 - length2);

        // Move the pointer of the longer list ahead by the difference in lengths
        ListNode pointer1 = (length1 > length2) ? head1 : head2;
        ListNode pointer2 = (length1 > length2) ? head2 : head1;

        for (int i = 0; i < lengthDiff; i++) {
            pointer1 = pointer1.next;
        }

        // Iterate through both lists until a common node is found
        while (pointer1 != null && pointer2 != null) {
            if (pointer1 == pointer2) {
                return pointer1; // Found the merge point
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return null; // No merge point found
    }

    public static void main(String[] args) {
        // Create sample linked lists
        ListNode commonNode = new ListNode(7);
        commonNode.next = new ListNode(8);
        commonNode.next.next = new ListNode(9);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = commonNode;

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = commonNode;

        // Find the merge point
        ListNode intersectionNode = findIntersection(head1, head2);

        if (intersectionNode != null) {
            System.out.println("The point where the two linked lists merge is: " + intersectionNode.data);
        } else {
            System.out.println("The two linked lists do not merge.");
        }
    }
}
