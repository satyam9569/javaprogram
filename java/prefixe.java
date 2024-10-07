import java.util.*;
 public class prefixe{
    public static void main(String arg[]){
        Stack<Integer>st=new Stack<>();
        Scanner sc=new Scanner (System.in);
       String str=sc.nextLine();
       int n1=0,n2=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int t=(int)ch;
            if(t >=48&&t<=57){
                st.push(t-48);
              //  System.out.println(ch);
                
            } 
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/'){
                 n1=st.pop();
                 n2=st.pop();
                // System.out.println(n1);
                 // System.out.println(n2);
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
                        case '/':
                  st.push(n1/n2);
                  break;
                        case '%':
                  st.push(n1%n2);
                  break;
                }
             // char c=(char)res;
               //st.push(res);
                       
                }
//System.out.println(ch);
            }


        System.out.println(st.peek());
    }
 }