public class removenthnode {
    static Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void addlist(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;
    }
    public static void remove1(int n){
        Node temp=head;
        if(n==1){
            head=head.next;
            return;
        }
        for(int i=0;i<n-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        addlist(1);
        addlist(2);
        addlist(3);
        addlist(4);
        remove1(1);
        display();
    }
}
