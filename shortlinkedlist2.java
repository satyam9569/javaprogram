import java.util.Scanner;

public class shortlinkedlist2 {
    static Node head1=null;     
    static int t=1,s=1,sum1=0,sum2=0,sum3=0;//input ->4,2,6
       static class Node{                   //output->2,4,6
        int data;                           
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void insert1(int data){
        Node newnode=new Node(data);
        if(head1==null){  
            head1=newnode;
            return;
        }
        newnode.next=head1;
        head1=newnode;
}
public static void shortlinklist(){
    Node temp=head1,temp1=head1.next;
     while(temp.next!=null){
        while(temp1!=null){
            if(temp.data>temp1.data){  //swap node ka data agare aage vale node ke value chote hote hai uske 
                                       //uske phale vale node se;
                int temp3=temp.data;
                temp.data=temp1.data;
                temp1.data=temp3;
            }
            temp1=temp1.next;
            }
            temp=temp.next;
            temp1=temp.next;
        }
     }
public static void display(){
    Node temp=head1;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
    
    }
    public static void main(String[] args) {
        int n,ch;
        Scanner sc=new Scanner (System.in);
        while(true){
            System.out.println("press <<->1 enter the node");
            System.out.println("press <<->2 short the linked list");
            System.out.println("press<<->3 display the all nodes");
            System.out.println("press <<->4 exit the code");
            System.out.println("enter your choice ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the data which want to insert");
                    n=sc.nextInt();
                    insert1(n);
                    break;
            case 2:
            System.out.println("value is shorted");
                shortlinklist();
                    break;
                    case 3:
                    display();
                    break;
                    case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
