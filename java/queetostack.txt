import java.util.*;
 public class stacktoqueue{
   public static class queue{
  
     static Stack<Integer>s1=new Stack<>();
       static Stack<Integer>s2=new Stack<>();
       public static boolean isEmpty() {
        return s1.isEmpty();
       }
        public static void add(int n){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(n);
   //    public static int remove(){
        while(!s2.isEmpty()){
            
         s1.push(s2.pop());   
        }
        }
        public static int remove(){
             if(isEmpty()){
         System.out.println("empaty queue");
         return-1;
             }
        return s1.pop();
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

               s2.push(s1.pop());
      }
       while(!s2.isEmpty()){
        s1.push(s2.pop());

                 }
       System.out.println(s1);
   }
       
    
    }
     
         public static void main(String arg[]){
                 queue q=new queue();
                
                 q.add(10);
                 q.add(20);
                  q.add(30);
                 q.add(40);
                 q.remove();
                 q.add(34);
                    q.remove();
                   q.display();
                    q.remove();
                    q.add(324);
                     q.display();
           //      while(!q.isEmpty()){
             // System.out.println(q.peek());
               //q.remove();
                // }
   // System.out.println(s1);

         }
    }