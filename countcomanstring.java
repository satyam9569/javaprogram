import java.util.Scanner;

public class countcomanstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String str1[]=new String[str.split("").length];
        str1=str.split("");
        int idx=str1.length;
        int f=0;
        int count=1;
        for(int i=0;i<str1.length;i++){
            for(int j=i+1;j<str1.length;j++){
              if(str1[i].compareTo(str1[j])>0){//ascending order in first string
                String temp=str1[i];
                str1[i]=str1[j];
                str1[j]=temp;
              }
    }
}
        for(int i=0;i<idx-1;i++){
                if(str1[i].equals(str1[i+1])){
                    count++;
            } else {
                if (count > 1) {
                    System.out.println(str1[i] + "," + count);
                }
                count = 1; // Reset count for the next character
            }
        }

                if (count > 1) {
                    System.out.println(str1[str1.length - 1] + "," + count);
                }
        }
    }
