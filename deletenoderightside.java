public class deletenoderightside{   //delete node any data right sise greter data
        static Node head=null;      // head.data<head.next.data  then delete node
    
       static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insert(int data){
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
    public static void deleteright(){
        Node temp=head;
        Node temp1=head.next;
        while(temp!=null){
            if(temp.data<temp1.data){
                temp.next=temp1.next;
                if(temp1.next!=null){  //exsiption aa rha hai null pointer ka handale kiya gaya hai 
                temp1=temp1.next;
                }
            
            }
            temp=temp.next;
            temp1=temp1.next;
            
        }
    }
public static void display(){
Node temp=head;
while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
}

}
public static void main(String[] args) {
    insert(12);
    insert(15);
    insert(10);
    insert(5);
    insert(2);
    insert(3);
    deleteright();
    display();
}
}