import java.util.*;
class Text{
  int a,b,c;
  public void display(int x,int y){
    a=x;
    b=y;
//System.out.println(a);
//System.out.println(b);
  }

 public void sum(){
    c=a+b;
    System.out.println(c);
  }
}

  public class obj{
    public static void main(String arg[]){

        Text P1=new Text();
         Text P2=new Text();
        
       Scanner sc=new Scanner (System.in);
   int a=sc.nextInt(); 
    int  b=sc.nextInt();
        P1.display(a,b);
        P2.sum();

    }
  }

