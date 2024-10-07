public class evenandoddnode{
        static Node head1=null,head2=null;      
    
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
        if(data%2==0){  //find the even number and insert head1 and odd nuber insert head2 and link the evan and odd;
        if(head1==null){  //input ->1,5,6,8,5,8;
            head1=newnode;//output->6,8,8,1,5,5;
            return;
        }
        Node temp1=head1;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=newnode;
    }
    else{
        if(head2==null){
            head2=newnode;
            return;
        }
        Node temp2=head2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=newnode;
}
    }
    public static void orderevenodd(){
        Node temp1=head1,temp2=head2;
        while(temp1.next!=null){
     temp1=temp1.next;
        }
        temp1.next=temp2;
    }
public static void display(){
Node temp=head1;
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
    insert(2);
    orderevenodd();
    display();
}
}