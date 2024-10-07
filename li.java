public class li{
    static Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node to the end of the list
    public static void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // Method to create a cycle in the linked list for testing
    public static void createCycle(int startIndex) {
        if (head == null) return;

        Node cycleStart = head;
        Node end = head;
        int index = 0;

        // Traverse to the end and the start of the cycle
        while (end.next != null) {
            if (index == startIndex) {
                cycleStart = end;
            }
            end = end.next;
            index++;
        }
        end.next = cycleStart; // Create a cycle
    }

    // Method to detect if there is a cycle in the linked list
    public static boolean hasCycle() {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // There is a cycle
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args){
        addlast(3);
        addlast(2);
        addlast(0);
        addlast(4);

        // Create a cycle for testing purposes (set startIndex to 1 or another valid index)
        createCycle(1);

        // Print whether there is a cycle in the list
        if (hasCycle()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}