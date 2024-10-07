class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;

    }
}
public class link5{
    public static void main(String arg[]){
        Node a=new Node(5);
         Node b=new Node(6);
          Node c=new Node(7);
           Node d=new Node(8);
           a.next=b;
           b.next=c;
           c.next=d;
          // a.next=b;
          Node temp=a;
          while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
          }
    }

}