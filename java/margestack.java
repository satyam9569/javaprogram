import java.util.*;
public class margestack{
    public static void main(String arg[]){
    Stack<Integer>st1=new Stack<>();
    Stack<Integer>st2=new Stack<>();
    st1.push(10);
    st1.push(20);
    st1.push(30);
    st1.push(40);
    System.out.println(st1);
    st1.push(50);
    st1.push(60);
    st1.push(70);
    st1.push(80);
    while(!st2.isEmpty()){
        st1.push(st2.pop());
    }
    System.out.println(st1);
}
}