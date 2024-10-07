public class removedblicate {
    static Node head = null;
static int t=0;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void removedubli(int data){

        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            t++;
            return;
        }
        Node temp=head;

       /*  for(int i=0;i<t;i++){  //step first
          if(temp.data==data){
            return;
          } 

          temp=temp.next;  
          
        }          
           temp=head;
           while(temp.next!=null){
            temp=temp.next;
           }
           temp.next=newnode;
           t++;
 */
while(temp!=null){
    if(temp.data==data){
        return;
    }
    temp=temp.next;
}
temp=head;
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
public static void main(String[] args) {
    removedubli(1);
    removedubli(2);
    removedubli(2);
    removedubli(2);
    removedubli(3);
    display();
}

}
