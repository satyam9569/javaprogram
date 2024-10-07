import java.util.*;
public class hashset{
    public static void main(String arg[]){
    HashSet<Integer>set=new HashSet<>();
    //insert data
    set.add(1);
      set.add(2);
        set.add(3);
          set.add(4);
            set.add(5);
       System.out.println(set);
       //serch the value
       if(set.contains(1)){
         System.out.println("it is contins value");   
       }
       if(!set.contains(6)){
            System.out.println("does not contin the value");
       }
       set.remove(4);
        System.out.println(set);
        Iterator it=set.iterator();
        while(it.hasNext()){
             System.out.println(it.next());
        }
}
}