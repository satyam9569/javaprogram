import java.util.*;
public class reversequee {
    public static void main(String[] args) {
       Queue<Integer>qe=new ArrayDeque<>();
       Stack<Integer>st=new Stack<>();
       qe.add(10); 
       qe.add(20);
       qe.add(30);
       qe.add(40);
      while(qe.size()!=0){
        st.push(qe.remove());
      }
     while(st.size()!=0){
        qe.add(st.peek());
        st.pop();
      }
       System.out.println(qe);
    }
}
