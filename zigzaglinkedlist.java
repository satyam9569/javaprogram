public class zigzaglinkedlist {
        static Node head=null;
    
       static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static void shortlink(int data) {
            Node newnode = new Node(data);
            if (head == null || head.data>=data){
                newnode.next = head;
                head = newnode;
                return;
            }
        
            Node temp = head;
            while (temp.next != null&& temp.next.data<data){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        public static void zigzag(){
            Node temp=head.next,temp1=head.next.next;
            while(temp!=null&&temp1!=null){ 
             if(temp.data<temp1.data){
                int tempe=temp.data;
                temp.data=temp1.data;
                temp1.data=tempe;
                if(temp.next==null||temp1.next==null){
                    return;
                }
                temp=temp.next;
                temp1=temp1.next; 
             }  
            temp=temp.next;
             temp1=temp1.next; 
            }
             

        }
        public static void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            
            }
        }
    
    public static void main(String[] args) {
        shortlink(11);
        shortlink(15);
        shortlink(20);
        shortlink(5);
        shortlink(10);
        shortlink(6);
        zigzag();
       display();
    }
    
    }

