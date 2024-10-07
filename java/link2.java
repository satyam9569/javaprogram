import java.util.*;
class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
    }
   Node currNode=head;
   while(currNode.next!=null){
    currNode=currNode.next;
   } 
currNode.next=newNode;
}
public void printlist(){
    if(head==null){
        System.out.print("node is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null){
     
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
        System.out.print("null");
}
}
public class link2{

  public static void main(String arg[]){
       LL list=new LL();
       list.addfirst("a");
       list.addfirst("is");
       list.addlast("thise");
       list.printlist();
  }
  }