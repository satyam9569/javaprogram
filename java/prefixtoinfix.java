import java.util.*;
 public class prefixtoinfix{
    public static void main(String arg[]){
        Stack<String>val=new Stack<>();
        Scanner sc=new Scanner (System.in);
       String str=sc.nextLine();
      // int n1=0,n2=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int t=(int)ch;
            if(t >=48&&t<=57||t>=97&&t<=122){
                val.push(ch+"");
                
            } 
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/'){
               String v1=val.pop();
               String v2=val.pop();
               char op=ch;
               String s="("+v1+op+v2+")";
               val.push(s);
               }
               }
               System.out.println(val);
               }
               }
