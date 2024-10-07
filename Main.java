import javax.sql.rowset.spi.SyncResolver;

    public class Main {
        public static void main(String[] args) {
            // Create first linked list: 2 -> 4 -> 3 (represents 342)
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);
    
            // Create second linked list: 5 -> 6 -> 4 (represents 465)
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);
    
            // Multiply the linked lists
            Main main = new Main();
            ListNode result = main.multiplyTwoLists(l1, l2);
    
            // Print result linked list
            printList(result);  // Should print 0 -> 8 -> 8 -> 8 -> 1 (represents 159,930)
        }
    
        // Helper function to print the linked list
        public static void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " -> ");
                head = head.next;
            }
            System.out.println("null");
        }
    }

    
