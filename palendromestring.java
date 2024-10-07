import java.util.*;
public class palendromestring {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String str=sc.nextLine(); 
    String str2[]=new String[45];

    String newstr[]=new String[str.split("").length];//thise line is converd the string to array
    newstr=str.split("");
    int st=newstr.length;
    int l=0;
    int h=st-1;
    while(l<=h){
       String temp=newstr[l];
       newstr[l]=newstr[h];
       newstr[h]=temp;
       l++;
       h--;
      }
    //  StringBuilder reversedStr = new StringBuilder();
     // String str2;
   //  String stre=new String(newstr);
   StringBuilder reversedStr = new StringBuilder();
   for (String s : newstr) {
       reversedStr.append(s);                      //thise line converd the array to string
   }
  String  reversedString = reversedStr.toString();
if(str.equals(reversedString)){
     System.out.println("yes ;palindrome");
}
else{
     System.out.println("not a palindrome");
}
   int f=0;
    for(int i=0;i<st;i++){
    System.out.print(newstr[i]);//it is line in reverse the string
    }  
     }
    }
