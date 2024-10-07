import java.util.*;
public class minvaluestack {
static int arr[]=new int[6],top=-1;
   static class show{
//static int arr[]=new arr[6],top=-1;
public static void push1(int n){
    if(top==5){
System.out.println("stack is full");
return;
    }
    top++;
    arr[top]=n;
}
public static void display(){
    int min=arr[0];
    for(int i=top;i>=0;i--){
        if(min>arr[i])
        min=arr[i];
        //System.out.println(arr[i]);
    }
    System.out.println(min);
}
}
public static void main(String args[]){
    show st=new show();
    st.push1(10);
    st.push1(1);
    st.push1(6);
    st.push1(9);
    st.push1(3);
   st.display();
    
}
}
