import java.util.*;
public class infixe{as.html
public static void main(String arg[]){
    String str="9-5+3*4\6";
    Stack<Integer>val=new Stack<>();
    Stack<Character>op=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int assii=(int)ch;
        if(assii>=48&&assii<=57){
            val.push(assii-48);
    
        }
        else if(op.size()==0){
            op.push(ch);

        }
        else{
            if(ch=='+'||ch=='-'){
                int n2=val.pop();
                int n1=val.pop();
            if(op.peek()=='-'){
            val.push(n1-n2);
            }
         if(op.peek()=='+'){
            val.push(n1+n2);
         }
          if(op.peek()=='*'){
            val.push(n1*n2);
            }
         if(op.peek()=='/'){
            val.push(n1/n2);
        }
        op.pop();
        op.push(ch);
    }
    if(ch=='*'||ch=='/'){
        
        int n2=val.pop();
                int n1=val.pop();

         if(op.peek()=='*'){
            val.push(n1*n2);
            }
         if(op.peek()=='/'){
            val.push(n1/n2);
        }
        op.pop();
        op.push(ch);
    }
else
    op.push( ch);
        }       
    }
    while(val.size()>1){
         int n2=val.pop();
                int n1=val.pop();

         if(op.peek()=='*'){
            val.push(n1*n2);
            }
         if(op.peek()=='/'){
            val.push(n1/n2);
         }
        op.pop();
         }
         System.out.println(val.peek());

}
}