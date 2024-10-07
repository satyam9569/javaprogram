import java.util.*;
 public class queetostack{
   public static class queue{
  
     static Queue<Integer>s1=new LinkedList<>();
       static Queue<Integer>s2=new LinkedList<>();
       public static boolean isEmpty() {
        return s1.isEmpty();
       }
        public static void push(int n){
            
            while(!s1.isEmpty()){
                s2.add(s1.remove());
               // s1.add(n);
            }
             s1.add(n);
   //    public static int remove(){
        while(!s2.isEmpty()){
            
         s1.add(s2.remove());   
        }
        }
        public static int pop(){
             if(isEmpty()){
         System.out.println("empaty queue");
         return-1;
             }
        return s1.remove();
       }
public static int peek(){
        if(isEmpty()){
         System.out.println("empaty queue");
            return-1;

        }
        return s1.peek();
       }

   void display(){
      while(!s1.isEmpty()){
              System.out.println(s1.peek());

               s2.add(s1.remove());
      }
       while(!s2.isEmpty()){
        s1.add(s2.remove());

                 }
       System.out.println(s1);
   }
       
    
    }
     
         public static void main(String arg[]){
                 queue q=new queue();
                
                 q.push(10);
                 q.push(20);
                  q.push(30);
                 q.push(40);
                 q.pop();
                q.display();
                q.push(45);
                q.push(56);
                 q.display();
           //      while(!q.isEmpty()){
             // System.out.println(q.peek());
               //q.remove();
                // }
   // System.out.println(s1);

         }
    }