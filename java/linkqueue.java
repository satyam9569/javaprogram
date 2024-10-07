import java.util.*;
public  class linkqueue{
    static class Node{
      //  int Node;
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class link{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null & tail==null;
        } 
        public static void add(int data){
            Node newNode=new Node( data);
            if(tail==null){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empaty queue");
                return -1;
            }
             int front=head.data;
            
                if(head==tail){
                    tail=null;
                }
                    head=head.next;
                    return front;
                }
            
        
        public static int peek(){
                        if(isEmpty()){
                System.out.println("empaty queue");
                return -1;
        } 
        return head.data;
    
        }
  
      }  
    public static void main(String args[]){
        link q=new link();
        q.add(34);
        q.add(56);
        while(!q.isEmpty()){
            System.out.println(q.peek());
                q.remove();

            
        }
    }
}