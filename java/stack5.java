
 import java.util.*;
public class stack5{
   static  int ch[] =new int[5];
    static int top=-1,size=10;
     public static class a{
    public static void  push(int n){
            top++;
           ch[top]=n;
        }
        int pop(){
            int n;
            n=ch[top];
            top--;
            return n;
        }
    } 
        public static void main(String arg[]){
           a st=new a();
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
                int n1=0,n2=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int assi=(int)ch;
            if(assi>=48&&assi<=57){
               st.push(assi-48);
            } 
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/'){
                 n2=st.pop();
                 n1=st.pop();
                switch(ch){
                    case '+':
                  st.push(n1+n2);
                  break;
                      case '-':
                  st.push(n1-n2);
                  break;
                     case '*':
                  st.push(n1*n2);
                  break;
            }
            }

              }
    System.out.println(st.pop());

         }
}
//}
//}