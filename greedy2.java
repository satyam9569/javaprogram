public class greedy2 {
   static Node head1=null,head2=null,head3=null;static int sum1=0,sum2=0,n,t,n1,t1;
  static class Node{
      int data;Node next;
      Node(int data){
        this.data=data;
        this.next=null;
      }
    }
    public static void push1(int data){
        Node newnode=new Node(data);
        if(head1==null){
            head1=newnode;
            return;
        }
        Node temp=head1;
          while(temp.next!=null){
            temp=temp.next;
          }
          temp.next=newnode;
    }       
    public static int pop1(){
        if(head1==null){
            System.out.println("stack is empaty");
            
        }
        Node temp=head1;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        n1=temp.next.data;
        temp.next=null;
        return n1;
    }
    public static void push2(int data){
        Node newnode=new Node(data);
        if(head2==null){
            head2=newnode;
            return;
        }
        Node temp=head2;
          while(temp.next!=null){
            temp=temp.next;
          }
          temp.next=newnode;
    }       
    public static int pop2(){
        if(head2==null){
            System.out.println("stack is empaty");
        }
        Node temp=head2;
        while(temp.next.next!=null){
            temp=temp.next;

        }
         n=temp.next.data;
        temp.next=null;
        return n;
    }
    public static void display(){
        Node temp=head1,temp1=head2;
        while(temp!=null){
            sum1=sum1+temp.data;
            temp=temp.next;
        }
    
        while(temp1!=null){
            sum2=sum2+temp1.data;
            temp1=temp1.next;
        }
        if(sum1==sum2){
            System.out.println(sum1);
        }
        else{
            n=pop2();
            t=sum2-n;
            n1=pop1();
            t1=sum1-n1;
            if(t==t1){
                System.out.println(t);
            }
        }
    }
    public static void main(String[] args) {
        push1(1);
        push1(1);
        push1(1);
        push1(2);
        push1(3);
        push2(2);
        push2(3);
        push2(4);
        display();
    }
}
