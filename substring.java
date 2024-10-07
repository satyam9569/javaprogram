import java.util.Scanner;

public class substring {
   public static void showsub(String str[],int n){
    int idx=str.length;
    if(n==idx){
        return;
    }
    for(int i=n;i<idx;i++){                            //it is code of found substring given any string
        for(int j=n;j<=i;j++){
            System.out.print(str[j]);
        }
        System.out.println();
    }
    showsub(str, n+1);
   } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    String str[]=new String[st.split("").length];
    str=st.split("");
    int n=0;
    showsub(str,n);
   }
}
