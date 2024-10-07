import java.util.*;
public class nonrepetingqueue {
    static  Node head=null;
    static class Node{
         char ch;
         Node next;
         public Node(char ch){
            this.ch=ch;
            this.next=null;
         }
    }
    public static void add1(char ch){
  Node newnode=new Node(ch);
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
    public static void display(){
        Node temp=head;
        Node temp1=head.next;
        while(temp1!=null){
            if(temp.ch==temp1.ch){
                temp1.ch='@';
            }
            temp1=temp1.next;
        }
        temp=head;
        while(temp!=null){
            System.out.println(temp.ch);
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        add1('a');
        add1('b');
        add1('a');
        display();
    }
}
