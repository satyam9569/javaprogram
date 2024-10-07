import java.util.*;
  public class stack6{
    public static void main(String arg[]){
        Stack<Character>st=new Stack<>();
        Scanner sc=new Scanner(System.in);

      String str=sc.nextLine();

      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        if(ch=='('){
          st.push(ch);
        }
        else if
            (st.size()==0){
                return-1;
        }
        if(st.peek()=='('){
            st.pop();
        }

      }
      System.out.println(st);
    }
  }