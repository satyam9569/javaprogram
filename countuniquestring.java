import java.util.Scanner;

public class countuniquestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String str1[]=new String[str.split("").length];
        str1=str.split("");
        int idx=str1.length;
        int f=0;
        int count=0;
        for(int i=0;i<idx;i++){
            f=0;
            for(int j=0;j<i;j++){
                if(str1[i].equals(str1[j])){
                    f=1;
                    break;
                }
        }
        if (f==0) {
            System.out.println(str1[i]);
            count++;
        }
        }
        System.out.println("unique value is a -> "+count);
    }
}
