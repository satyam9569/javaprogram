public class linkedlist {
    //static Node head;
    public static class buildlinkedlist{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   // public static class buildlinkedlist{
   static int size=0;
        public static void insertfirst(int data){
Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                size++;
                return;
            
            }
            newnode.next=head;
            head=newnode;
            size++;
        }
        public static void insertLast(int data){
             Node newnode=new Node(data);
             if(head==null){
                head=newnode;
                size++;
             }
             Node temp;
             temp=head;
             while(temp.next!=null){
                temp=temp.next;
             }
             temp.next=newnode;
             size++;
        }
        public static void deletefirst(){
            
            head=head.next;
            size--;
        }
        public static void deletelast(){
            if(head.next==null){
                head=null;
                size--;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }
        public static void insertatposition(int idx,int val){
            Node newnode=new Node(val);
            Node temp=head;
            if(idx==1){
                size++;
                insertfirst(val);
            
                return;
            }
            else if(idx==size+1){
                insertLast(val);
                size++;
                return;
            }
            idx=idx-1;
            for(int i=1;i<idx-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
        public static void deleteatposition(int idx){
            if(idx==1){
                //head=head.next;
                deletefirst();
                return;
            }
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                 temp=temp.next;
            }
            temp.next=temp.next.next;
            
        }

    public static void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
    public static void main(String[] args) {
        buildlinkedlist link=new buildlinkedlist();
        link.insertfirst(10);
        link.insertfirst(30);
        link.insertLast(23);
        link.display();
       // link.deletefirst();
        //link.display();
       // link.deletelast();
      //  link.display();
       // link.insertatposition(1,55);
        link.deleteatposition(1);
       link .deletelast();
        link.display();
    }
}
