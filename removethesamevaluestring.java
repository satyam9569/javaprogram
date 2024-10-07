import java.util.*;
public class removethesamevaluestring {
  public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.println("input the string");
   String str=sc.nextLine();
   String str1[]=new String[str.split("").length];
   str1=str.split("");
   int idx=str1.length;
   for(int i=0;i<idx;i++){
    if(i>=0&&i<idx-1){   //thise line only exsption control
        if(str1[i].equals(str1[i+1])){
               i++;
        }
    }
    System.out.print(str1[i]);
   } 
  }  
}                                                           //it is code of given sting is=saatyam
                                                            //then remove the a =satyam
                                                            //saattyyaamm
                                                            //output=satyam