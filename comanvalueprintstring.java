import java.util.Scanner;

public class comanvalueprintstring {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
   System.out.println("input the string");
   String str=sc.nextLine();
   String str1[]=new String[str.split("").length];
   str1=str.split("");
   int idx=str1.length;
   int f=0;
        for(int i=0;i<idx;i++){
            f=0;
              for(int j=0;j<i;j++){//int j =i+1;j<idx;j++;
               
                if(str1[i].equals(str1[j])){
                    f=1;
                   break;
                }
              }
          if(f==1){
    System.out.println(str1[i]);
          }  
    }
        }
    }                                      //input=satyam satish 
                                          //output=
