public class shortlinkedlist {
    static Node head=null;

   static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    /*public static void shortlink(int data){
        Node newnode=new Node(data);
        Node temp=head;
       if(head==null){
        head=newnode;
        temp=newnode;
        return;
       }
       while(newnode.data>temp.data||temp.next!=null){
        temp=temp.next;
       }
       if(temp.next==null){
        temp.next=newnode;
       }
       else{
        newnode.next=temp.next;
        temp.next=newnode;
       }
    }*/
    public static void shortlink(int data) {
        Node newnode = new Node(data);
        if (head == null || head.data>=data){
            newnode.next = head;
            head = newnode;
            return;
        }
    
        Node temp = head;
        while (temp.next != null&& temp.next.data<data){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
public static void main(String[] args) {
    shortlink(1);
    shortlink(2);
    shortlink(0);
    shortlink(11);
    shortlink(3);
   display();
}

}
