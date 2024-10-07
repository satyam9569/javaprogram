import java.util.*;
   public class link4{
    public static void main(String arg[]){
    LinkedList<Integer>list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
         System.out.print("enter the index");
        int idx=sc.nextInt();
         System.out.print("enter the value");
        int val=sc.nextInt();
        int size=5;
        if(idx >=size){
            System.out.println("rong index insret plese try agin");
        }
        for(int i=0;i<size;i++){
                int a=sc.nextInt();
                list.addLast(a);
                if(i==idx-1){
                list.addLast(val);
                }
                if(i==0&&idx==0){
                list.addFirst(val);
                }
        }
        
        for(int i=0;i<list.size();i++){

            System.out.print(list.get(i)+"->");
        }
    }
   }