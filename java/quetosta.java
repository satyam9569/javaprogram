import java.util.*;
  public class quetosta{
    public static class sta{
        Queue<Integer>qe=new LinkedList<>();
      public  void push(int x){
        if(qe.size()==0){
            qe.add(x);
        }
        else{
        qe.add(x);
             for(int i=1;i<=qe.size()-1;i++){
                qe.add(qe.remove());
             }
        }
        }
      public  int pop(){
            if(qe.size()==0){
                System.out.println("stack is empaty");
            }
            int n =qe.remove();
            return n;
        }
      public  int peek(){
 if(qe.size()==0){
                System.out.println("stack is empaty");
            }
            int n =qe.remove();
            return n;
        }
      public   void display(){
            System.out.println(qe);
        }
        }
        public static void main(String arg[]){
        sta st=new sta();
        st.push(1);
         st.push(2);
          st.push(3);
           st.push(4);
           st.pop();
           st.push(12);
          st. display();
        }
    }