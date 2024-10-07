import java.util.*;
   public class stack3{
    public static void main(String arg[]){
        Stack<String>st=new Stack<String>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1[]=new String[str.split("").length];
        str1=str.split("");
for(int i=0;i<str1.length;i++){
//System.out.println(str1[i]);
if(str1[i].compareTo("6")==0){
st.push(str1[i]-48);
}
}
      System.out.println(st);  

       
    }
   }