import java.util.*;
public class findstack2{
   static class A{
     Stack<Integer>st=new Stack<>();
    void insert(int n){
        if(!st.contains(n)){//agre phale se stack me vale hai to insert nhi karega

            st.push(n);
        }
        else{
            System.out.println("value are present");
        }
    System.out.println(st);
    }
    }
        public static void main(String arg[]){
     //Stack<Integer>st=new Stack<>();
     A d=new A();
   d.insert(10);
   d.insert(20);
   d.insert(10);
   d.insert(30);
        }
        }