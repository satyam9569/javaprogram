import java.util.*;
public class findstack{
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
        int f=0;
        while(!st.isEmpty()){
            if(st.pop()==n){
                f=1;
            }
        }
        if(f==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}