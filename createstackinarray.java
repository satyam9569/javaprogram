public class createstackinarray {
    static int top=-1,size=5,arr[]=new int[size];
    public static void push(int n){
        if(top==size){
            System.out.println("stack is full");
            return;
        }
    top++;
    arr[top]=n;
    }
    public static void pop(){
        int n;
if(top==-1){
    System.out.println("stack is empaty");
}
n=arr[top];
top--;
System.out.println("value is poped->"+n);
    }
    public static void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
      push(10);
      push(20);
      push(30);
      pop();
      display();
    }
}
