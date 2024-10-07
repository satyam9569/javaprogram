import java.util.*;
public class equalbracketstring {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter the first bracket");
     char ch1=sc.next().charAt(0);
     System.out.println("enter the second bracket");
     char ch2=sc.next().charAt(0);
     int f=0;
     if(ch1=='{'&&ch2=='}'){
        f=1;
     }
     else if(ch1=='['&&ch2==']'){
        f=1;
     }
     else if(ch1=='('&&ch2==')'){
        f=1;
     }
     if(f==1){
        System.out.println("it is a same bracket");
     }
     else{
        System.out.println("not a same bracket");
     }

    }
}
