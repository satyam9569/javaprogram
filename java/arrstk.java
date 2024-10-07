import java.util.*;
public  class arrstk{
  public static  class a{
        int stk[]=new int[5];
      int top=-1,size=5;
      void push(int x){
            if(top==size-1){
                System.out.println("stack is full");
                return;
            }
            top++;
            stk[top]=x;
        }
        int pop(){
            if(top==-1){
              System.out.println("stack is empty");   
            }
            int n=stk[top];
            top--;
            
            return n;
        }
        void display(){
            int i;
            for(i=top;i>=0;i--){
                 System.out.println(stk[i]);
            }
        }
   }
        public static void main(String arg[]){
          a st=new a();
           st.  push(10);
           st.push(20);
           st.display();
           st.pop();
           st.display(); 
    }
}