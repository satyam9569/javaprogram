import java.util.*;
public class revercethecharcter {
   public static void main(String[] args) {
    char ch[]=new char[3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the charter who want to reverce");
    for (int i=0;i<ch.length;i++){
        ch[i]=sc.next().charAt(0);
    }
    String str1=new String(ch);
    System.out.println("it is orginal string -> "+str1);
    int l=0;
    int h=ch.length-1;
    while(l<h){
        char temp=ch[l];//it is reverce the char value
        ch[l]=ch[h];
        ch[h]=temp;
        l++;
        h--;
    }
    String str2=new String(ch);//char to string convircion
   // for (int i=0;i<ch.length;i++){
     //   System.out.println(ch[i]);
  //  }
    System.out.println("it is reverse string  ->"+str2);
    if(str1.equals(str2)){//comapre two string
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
   } 
}
