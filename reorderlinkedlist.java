public class reorderlinkedlist {
    static Node head = null;

    static class Node {   //input 1->2->3->4
        int data;         //output 1->4->2->3
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void add(int data){
      Node newnode=new Node(data);
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
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void reorder(){
        Node temp=head,t=head,t1;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        t1=temp.next;
        temp.next=null;
        t1.next=t.next;
        t.next=t1;
    }
    
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        reorder();
        display();
    }
}
