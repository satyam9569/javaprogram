import java.util.*;
public class queue{
    public static void main (String arg[]){
        Queue<Integer>q=new LinkedList<>();
         q.add(12);
          q.add(13);
          q.add(14);
          q.add(15);
    System.out.println(q.size());
    int s;
    s=q.size();

       int i=0;
        while(i<s){
             System.out.println(q.remove());
             System.out.println("removed");
         i++;
        }
         System.out.println(q);
        }
    }
