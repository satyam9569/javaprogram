import java.util.*;
  public class implmentstacklinkedlist{
      static Node head=null;
      static class Node{
          int data;
          Node next;
          Node(int data){
            this.data=data;
            this.next=null;
          }
      }
      public static class implementstack{
          public  void push(int data){
              Node newnode=new Node(data);
              Node temp=head;
              if(head==null){
                  head=newnode;
                 //newnode=null;
                 return;
              }
              newnode.next=head;
              head=newnode;          
          }
        public void pop(){
            if(head==null){
                System.out.println("stack is empaty");
            }
            head=head.next;
        }
        public void insert(int data){
             Node newnode=new Node(data);
             if(head==null){
                 head=newnode;
                // newnode=null;
                 return;
             }
             Node temp=head;
             while(temp.next!=null){
                 temp=temp.next;
             }
             temp.next=newnode;
        }
        public void delete(){
            if(head==null){
                System.out.println("stack is empaty");
            }
            head=head.next;
        }
          public void display(){
             Node temp=head;
             while(temp!=null){
                 System.out.println(temp.data);
                 temp=temp.next;
             }
          }
      }
      public static void main(String arg[]){
          implementstack st=new implementstack();
          //int n,a,ch;
          Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("press>>1 push the stack");
                 System.out.println("press>>2 pop the stack");
                  System.out.println("press>>3 insert the queue");
                   System.out.println("press>>4 delete the queue");
                    System.out.println("press>>5 display");
                     System.out.println("enter your choice");
                      int ch=sc.nextInt();
                      switch(ch){
                          case 1:
                           System.out.println("enter the push the data in stack");
                             int n=sc.nextInt();
                             st.push(n);
                             break;
                             case 2:
                             st.pop();
                             break;
                             case 3:
                               System.out.println("enter the insert the data in stack");
                             int a=sc.nextInt();
                             st.insert(a);
                             break;
                             case 4:
                             st.delete();
                             break;
                             case 5:
                             st.display();
                             break;
                             case 6:
                             System.exit(0);
                      }
            }
      }

  }