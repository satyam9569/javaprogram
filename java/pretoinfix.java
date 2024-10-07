import java.util.*;
public class pretoinfix{
    public static void main(String arg[]){
          Stack<String>val=new Stack<>();
    Stack<Character>op=new Stack<>();
    String str="9-5+3*4/6";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int assii=(int)ch;
        if(assii>=48&&assii<=57){
            String t=""+ch;
            val.push(t);
    }
    else if(op.size()==0||ch=='('||op.peek()=='('){
        op.push(ch);
    }
        else if(ch==')'){
            while(op.peek()=='('){
                String v2=val.pop();
                String v1=val.pop();
                char o=op.pop();
                String s=v1+v2+o;
                val.push(s);
            }
            op.pop();
        }
        else{
            if(ch=='+'||ch=='-'){
               String v2=val.pop();
                String v1=val.pop();
                char o=op.pop();
                String s=v1+v2+o;
                val.push(s);  
                op.push(ch);
            }
               if(ch=='*'||ch=='/'){
            if(op.peek()=='*'||op.peek()=='/'){
               String v2=val.pop();
                String v1=val.pop();
                char o=op.pop();
                String s=v1+v2+o;
                val.push(s);  
                op.push(ch);
            }
            else op.push(ch);
        }
        }
    }
    while(val.size()>1){
         String v2=val.pop();
                String v1=val.pop();
                char o=op.pop();
                String s=v1+v2+o;
                val.push(s); 
    }
    String prefix=val.pop();
    System.out.println(prefix);
}
    }
