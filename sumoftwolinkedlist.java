public class sumoftwolinkedlist {
    
        static Node head1=null,head2=null;      
    static int t=1,s=1,sum1=0,sum2=0,sum3=0;//input1 ->4,5,6
       static class Node{                   //input2->7,8,9
        int data;                           //output->456+789=1245
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insert1(int data){
        Node newnode=new Node(data);
        if(head1==null){  
            data=data*t;
            head1=newnode;
            return;
        }
        t=t*10;
        newnode.data=data*t;
        newnode.next=head1;
        head1=newnode;
}
public static void insert2(int data){
    Node newnode=new Node(data);
    if(head2==null){  
        data=data*s;
        head2=newnode;
        return;
    }
    s=s*10;  //aane vale data me multiplay kiya gaya hai ->1,2,3->1*1+2*10+3*100=123
    newnode.data=data*s;
    newnode.next=head2;
    head2=newnode;
}
public static void sumoftwolinkedlist(){
    Node temp1=head1,temp2=head2;
   while(temp1!=null){
    sum1=sum1+temp1.data;
temp1=temp1.next;
   }
   while(temp2!=null){
    sum2=sum2+temp2.data;
temp2=temp2.next;
}
sum3=sum1+sum2;  //sum of first and second linked list;
System.out.println("sum of two linked list ->"+sum3);
}
public static void multiplayoftwolinkedlist(){
    System.out.println("multiply of two list"+sum1*sum2);
}
    public static void main(String[] args) {
        insert1(6);
        insert1(4);
        insert1(9);
        insert2(4);
        insert2(8);
      //  insert2(3);
        sumoftwolinkedlist();
        multiplayoftwolinkedlist();
       // display();
    }
    }
