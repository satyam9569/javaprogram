public class implementdubleindedquee {
    static int front=-1,rear=-1,arr[]=new int[11],size=0,arr1[]=new int[11],t=0,k=0;
    public static void insertlast(int n){
        if(rear==10){
            System.out.println("quee is full");
            return ;
        }
        if(front==-1){
            front++;
            rear++;
        arr[front]=n;
        size++;
        return ;
        }
        else{
            rear++;
            arr[rear]=n;
            size++;
            return;
        }
    }
    public static void insertfirst(int n){
        if(rear==10){
            System.out.println("queue is full");
            return;
        }
        while(size!=0){
  arr1[t]=deletefirst();
t++;
        }
        front=-1;
        rear=-1;
        front++;
        rear++;
        arr[front]=n;
        size++;
        for(int i=0;i<t;i++){
           // insertlast(arr1[i]);
            insertlast(arr1[i]);
        }
        t=0;
    }
    public static int deletefirst(){
        if(front==-1){
            System.out.println("queue is empaty");
            return 0;
        }
        int n=arr[front];
        front++;
        size--;
        return n;
    }
    public static void deletelast(){
        if(front==-1){
            System.out.println("queue is empaty");
            return ;
        }
        if(size==1){
            deletefirst();
            return;
        }
        while(size!=1){
            arr1[t]=deletefirst();
            t++;
        }
        deletefirst();
        front=-1;
        rear=-1;
        for(int i=0;i<t;i++){
            // insertlast(arr1[i]);
             insertlast(arr1[i]);
         }
         t=0;
    }
    public static void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
            System.out.println(size);
        }

    }
    public static void main(String[] args) {
        insertlast(10);
        insertlast(20);
        insertlast(30);
        insertlast(40);
        insertfirst(9);
        insertfirst(90);
        insertlast(34);
        deletefirst();
       deletefirst();
        display();
    }
}
