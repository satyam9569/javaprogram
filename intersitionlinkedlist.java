public class intersitionlinkedlist {
    static Node head =null;
    static Node head2=null;
    static class Node {
        int data;
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
    public static void add1(int data){
        Node newnode=new Node(data);
        if(head2==null){
          head2=newnode;
          if(head.data==head2.data){
           System.out.println(head.data);
          }
          //head2=newnode;
          return;
        }  
        Node temp1=head2,temp=head;
        while(temp!=null){
          if(data==temp.data){
            System.out.println(temp.data);
          }
          temp=temp.next;
        }
        temp1=head2;
        while(temp1.next!=null){
          temp1=temp1.next;
        }
        temp1.next=newnode;
    }


      public static void display(){
        Node temp=head2;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
       add(1);
       add(2); 
       add(3);
       add(4);
       add1(5);
       add1(6);
       add1(3);
       // display();
    }
}
