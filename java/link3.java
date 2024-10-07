import java.util.*;
  public class link3{
    public static void main(String arg[]){
      LinkedList<Integer>List=new LinkedList<Integer>();
      Scanner sc=new Scanner (System.in);
      for(int i=0;i<=5;i++){
        int a=sc.nextInt();
        List.addLast(a);
      }
      for(int i=0;i<List.size();i++){
        if(List.get(i)==7){
            System.out.println("index is a=="+i);
        }
       // else{
         //   System.out.println(List.get(i)+"->");
        //}
      }
    }
  }