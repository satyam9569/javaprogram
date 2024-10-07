public class Permutationstack {
static int arr[]=new int[6],top=-1,size=0;
static int arrsize=9;
   static class show{
//static int arr[]=new arr[6],top=-1;
public static void push1(int n){
    if(top==arrsize-1){
System.out.println("stack is full");
return;
    }
    size++;
    top++;
    arr[top]=n;
}
/*public static void short1(int n){
    if(n==size-1){
        return;
    }
    for(int i=n;i<=top;i++){
        if(arr[n]<arr[i+1]){
          int temp=arr[n];
          arr[n]=arr[i+1];
          arr[i+1]=temp;
        }
    }
    short1(n+1);
}
    */
    public static void short1(int n,int m){
        if(n==size-2){
            return;
        }
        if(m==size-1){
            n=n+1;
            m=n+1;
        }
            if(arr[n]<arr[m]){
              int temp=arr[n];
              arr[n]=arr[m];
              arr[m]=temp;
            }
        short1(n,m+1);
    }
public static void display(){
    for(int i=top;i>=0;i--){
        System.out.println(arr[i]);
    }
}
   }
public static void main(String args[]){
    show st=new show();
    int n=0,m=1;
    st.push1(10);
    st.push1(1);
    st.push1(6);
    st.push1(9);
    st.push1(3);
   st.short1(n,m);
   st.display();
    
}
}

