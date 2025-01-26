import java.util.*;
public class addspespicpostionlinkedlist {
    static Node head;
    static class  Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    public static void insertfirst(int data){
     Node newnode=new Node(data);
     if(head==null){
     head=newnode;
     return;
     }
     newnode.next=head;
     head=newnode;
     return;
    }
    public static void insertpos(int data,int pos){
     Node newnode=new Node(data);
     if(pos==1){
        insertfirst(data);
        return;
     } 
     Node temp=head,temp1=head.next;
     for(int i=0;i<pos-2;i++){
       temp=temp.next;
     } 
     newnode.next=temp.next;
     temp.next=newnode;
     
    }
public static void printlist(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
public static void main(String arg[]){
  insertfirst(1);
  insertfirst(2);
  insertpos(11, 1);
  insertpos(12,2);
  insertpos(13,3);
  insertpos(14,5 );
  printlist();
}
}
