import java.util.*;
public class addpolynomial {
    static Node head1=null,head2=null,head3=null;     
       static class Node{                 
        int coff; 
        int exp;                          
        Node next;
        Node(int coff,int exp){
            this.coff=coff;
            this.exp=exp;
            this.next=null;
        }
    } 
    public static void insert1(int coff,int exp){//function the insert the first polynomial;
        Node newnode=new Node(coff,exp);
        if(head1==null){
            head1=newnode;
            return;
        }
        Node temp=head1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void insert2(int coff,int exp){  //function of insert second polynomial
        Node newnode=new Node(coff,exp);
        if(head2==null){
            head2=newnode;
            return;
        }
        Node temp=head2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void insert3(int coff,int exp){//it is a function whean add the two polynomial then add 
        Node newnode=new Node(coff,exp);
        if(head3==null){
            head3=newnode;
            return;
        }
        Node temp=head3;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void addpoly(){
        Node temp1=head1,temp2=head2;
        while(temp1!=null&&temp2!=null){
          if(temp1.exp==temp2.exp){
            insert3(temp1.coff+temp2.coff,temp1.exp);  //it is add polynomial and push all the data insert3 function
            temp1=temp1.next;
            temp2=temp2.next;
          }
         else if(temp1.exp>temp2.exp){
            insert3(temp1.coff,temp1.exp);
            temp1=temp1.next;
          }
          else{
            insert3(temp2.coff,temp2.exp);
            temp2=temp2.next;
          }
        }
        while(temp1!=null){
            insert3(temp1.coff,temp1.exp);
            temp1=temp1.next;
        }
        while(temp2!=null){
            insert3(temp2.coff,temp2.exp);
            temp2=temp2.next;
        }
    }
    public static void short1(){
        Node temp1=head1,temp2=head1.next;
        int n1,n2;
        while(temp1.next!=null){
            while(temp2!=null){
                if(temp1.exp<temp2.exp){
                n1=temp1.coff;
                n2=temp1.exp;
                temp1.coff=temp2.coff;
                temp1.exp=temp2.exp;
                temp2.coff=n1;
                temp2.exp=n2;

                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
            temp2=temp1.next;
        }
         temp1=head2;
        temp2=head2.next;
        while(temp1.next!=null){
            while(temp2!=null){
                if(temp1.exp<temp2.exp){
                n1=temp1.coff;
                n2=temp1.exp;
                temp1.coff=temp2.coff;
                temp1.exp=temp2.exp;
                temp2.coff=n1;
                temp2.exp=n2;

                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
            temp2=temp1.next;
        }
    }
    public static void display(){
        Node temp1=head1,temp2=head2,temp3=head3;
        while(temp1!=null){
            System.out.print(temp1.coff+"x"+"^"+temp1.exp+"+");
            temp1=temp1.next;
        }
        System.out.println();
        while(temp2!=null){
            System.out.print(temp2.coff+"x"+"^"+temp2.exp+"+");
            temp2=temp2.next;
        }
        System.out.println();
        while(temp3!=null){
            System.out.print(temp3.coff+"x"+"^"+temp3.exp+"+");
            temp3=temp3.next;
        }
}
public static void main(String[] args) {
 int n1,n2;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the first poly nuber how musch data insert");//first polynomial
  n1=sc.nextInt();   
  for(int i=0;i<n1;i++){
    System.out.println("enter the coffecient");
    int c=sc.nextInt();
    System.out.println("enter the exponent");
    int e=sc.nextInt();
    insert1(c,e);
  }
  System.out.println("enter the scond poly nuber how musch data insert");  //insert the second polynomial
  n2=sc.nextInt();   
  for(int i=0;i<n2;i++){
    System.out.println("enter the coffecient");
    int c=sc.nextInt();
    System.out.println("enter the exponent");
    int e=sc.nextInt();
    insert2(c,e);
  }
 // addpoly();//thise function is add the two polynomial
 short1();//thise functio short the polynomial;
  display();
}
}