import java.util.*;
public class arrque{
static    class arr{
        static int a[]=new int[5];
        static int front=-1;
        static int rear=-1;
        static int size=5;
        public static void add(int n){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front++;
            }
            rear++;
            a[rear]=n;
        }
        public  int remove(){
            if(front==-1){
                System.out.println("stack is empaty");
            }
             int n=a[front];
           // return n;
            
            if(front==rear){
                front=rear=-1;
            }
            else{
                front++;
            }
             return n;         
        }
public static void dispaly(){
for(int i=front;i<=rear;i++){
System.out.println(a[i]);
}
}
    }
    public static void main(String arg[]){
        arr q=new arr();
        q.add(23);
         q.add(24);
          q.add(25);
          q.dispaly();
          q.remove();
           q.dispaly();
    }
}