import java.util.*;
  public class binarytree{
      // Node head;
     static class a{
     static Node head;
      class Node{
          int data;
          Node next;
          Node(int data){
            this.data=data;
            this.next=null;
          }
      }
      public  void insertatfirst(int data){
          Node newnode=new Node(data);
          if(head==null){
              head=newnode;
              return;
          }
          newnode.next=head;
          head=newnode;

      }
       public void  insertatposition(int idx,int val){
        Node newnode=new Node(val);
           Node temp=head;
           if(idx==0){
               insertatfirst(val);
           }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        
       }
       public  void deletevalue(){
           int f=0;
           Node temp=head;
           Node prev=null;
           int key=10;
           while(head!=null){
               if(temp.data==key){
                    f=1;
                   break;
                  // head=head.next;
               }
               prev=temp;
               temp=temp.next;
           }
           if(f==1){
               prev.next=temp.next;
               System.out.println("thise value is deletefd"+temp.data);
           }
        
       }
      public static void print(){
          Node temp=head;
          while(temp!=null){
        System.out.println(temp.data);
          temp=temp.next;
          }
      }
      }
      public static void main(String arg[]){
          a obj=new a();
          obj.insertatfirst(10);
          obj.insertatfirst(20);
          obj.insertatfirst(30);
         // obj.print();
          //obj.insertatposition(0,111);
           obj.print();
           obj.deletevalue();
           obj.print();
      }
  }