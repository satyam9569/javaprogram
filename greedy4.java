public class greedy4 {  //how to find maximum profit wight given wight
    static Node head=null;//(60,10)(120,30)(100,20)->given quistion first we shadule thise value accending order in divde by profit and wight
    static int sum=0;     //6,5,4
    static class Node{     //(60,10)(100,20)(120,30)->given wight 50;
        int profit;         //ans ->240;
        int wight;
        Node next;
        public Node(int profit,int wight){
            this.profit=profit;
            this.wight=wight;
            this.next=null;
        }
    }
    public static void push1(int profit,int wight){
        Node newnode=new Node(profit,wight);
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
    public static void short1(){
        Node temp1=head,temp2=head.next;
        while(temp1.next!=null){
            while(temp2!=null){
                if(temp1.profit/temp1.wight<temp2.profit/temp2.wight){
                    int t1=temp1.profit;
                    int t2=temp1.wight;
                    temp1.profit=temp2.profit;
                    temp1.wight=temp2.wight;
                    temp2.profit=t1;
                    temp2.wight=t2;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
            temp2=temp1.next;
        }
    }
    public static void dispaly(){
        Node temp=head;
        int we=10;
        while(temp!=null){
            if(temp.wight!=we){
                if(we>=temp.wight){
                    sum=sum+temp.profit;
                }
                else{
                    sum=sum+(we*temp.profit)/temp.wight;
                   return;
                }
            }
            we=we-temp.wight;
            temp=temp.next;
        }
       // System.out.println(sum);
    }
    public static void main(String[] args) {
        //push1(60,10);
        //push1(120,30);
        push1(500,30);
        short1();
        dispaly();
        System.out.println(sum);
    }
}
