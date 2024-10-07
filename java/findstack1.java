import java.util.*;
public class findstack1{
    public static void main(String arg[]){
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
         st.push(30);
        st.push(40);
         st.push(50);
        st.push(60);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           if( st.contains(n)){//it is found the value are present or not in Stack
            System.out.println("found");
           }
        
    }
}
