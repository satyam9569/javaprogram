import java.util.*;
 public class link{
  public static void main(String arg[]){
    Scanner sc=new Scanner (System.in);
    String str=sc.next();
    String str1[]=new String[str.split(" ").length];
   str1=str.split(" ");
String temp;
   for(int i=0;i<str1.length;i++){
    int  l=str1.length-1;
  int h=0;
        while(l>h){
          temp=str1[l];
          str1[l]=str1[h];
          str1[h]=temp;
          l--;
          h++;
        }
   }
        for(int i=0;i<str1.length;i++){
          System.out.println(str1[i]);
        }
  }
 }