import java.util.*;
 public class postetopre{
    public static void main(String arg[]){
        Stack<String>val=new Stack<>();
        Scanner sc=new Scanner (System.in);
       String str=sc.nextLine();
      // int n1=0,n2=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int t=(int)ch;
            if(t >=48&&t<=57||t>=97&&t<=122){
                val.push(ch+"");
                
            } 
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/'){
               String v2=val.pop();
               String v1=val.pop();
               char op=ch;
               String s=op+v1+v2;
               val.push(s);
               }
               }
               System.out.println(val);
               }
               }
