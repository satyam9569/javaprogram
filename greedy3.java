public class greedy3 {
    static Node head=null,head1=null;  //job sequencing problem;
   static int size,t=0;
    static char a[]=new char[size];
    static class Node{
        char jobid;
        int deidline;
        int profit;
        Node next;
        Node(char jobid,int deidline,int profit){
            this.jobid=jobid;
            this.deidline=deidline;
            this.profit=profit;
            this.next=null;
        }
    }
    public static void push(char jobid,int deidline,int profit ){
        Node newnode =new Node(jobid, deidline, profit);
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
    public static void short1(){
       Node temp=head,temp1=head.next;
       while(temp.next!=null){
        while(temp1!=null){
            if(temp.profit<temp1.profit){
                int te=temp.profit;
                int t=temp.deidline;
                char s=temp.jobid;
                temp.profit=temp1.profit;
                temp.deidline=temp1.deidline;
                temp.jobid=temp1.jobid;
                temp1.profit=te;
                temp1.deidline=t;
                temp1.jobid=s;
            }
                temp1=temp1.next;
    
        }
        temp=temp.next;
        temp1=temp.next;
       }
    }
    public static void push1(char jobid){
         char arr[]=new char[4];
        arr[t]=jobid;
       // char c=(char)arr[t];
       System.out.println(arr[t]);
        t++;
    }

    public static void dispaly(){
        Node temp=head;
        int s=head.deidline,t=0;
        while(temp!=null){
          //  System.out.println(temp.jobid+" "+temp.deidline+" "+temp.profit);
            if(s!=t){
            push1(temp.jobid);
            t++;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        push('a',2,50);
        push('b',1,15);
        push('c',2,10);
        push('d',1,25);
        short1();
        dispaly();
    }
}
