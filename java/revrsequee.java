import java.util.*;
public class revrsequee{
   static class stk{
  //  public static void main(String arg[]){
        //Queue<Integer>qe=new LinkedList<>();
          Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        void insert(int n){
          int y;
            if(s1.size()==0){
        y=s1.push(n);
            }
        int x= s1.push(n);
         if(y==x){
             System.out.println("sd");
         }
        System.out.println(s1);
        }
    }
       
         public static void main(String arg[]){
            stk st=new stk();
            st.insert(10);
            st.insert(20);
    }
    
}