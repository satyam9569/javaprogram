import java.util.*;
public class matrix5 {
    public static void main(String[] args) {
        String str[][]=new String[4][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            str[i][j]=sc.next();
            }
        }
        System.out.println("enter the serch string");
        sc =new Scanner(System.in);
        String ch=sc.next();
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                //System.out.print(str[i][j]);
                if(ch.equals(str[i][j])){
                    System.out.println("found");
                }
            }
          //  System.out.println();
        }
    }
}
