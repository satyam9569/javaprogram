import java.util.*;
public class li{
    int i;

void display(){
   for(int i=0;i<list.size();i++){
  System.out.println(list.get(i));
  }  
}    
          public class lin{
    public static void main(String arg[]){
        li s1=new li();
        ArrayList <Integer>list=new ArrayList<Integer>();
        int size=5,a=5;
      
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=size;i++){
        int a=sc.nextInt();
          list.add(a);
        }
          s1.display();
    }
    }
}