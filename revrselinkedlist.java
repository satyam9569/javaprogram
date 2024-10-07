public class revrselinkedlist{
    static Node head=null;

   static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static void reverselist(int data){
    Node newnode=new Node(data);
    if(head==null){
    head=newnode;
    return;
    }
    newnode.next=head;
    head=newnode;
}
public static void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
    public static void main(String[] args) {
        reverselist(1);
        reverselist(2);
        reverselist(3);
        reverselist(4);
        reverselist(5);
        display();
        
    }
}
